package au.com.venilia.emailais.signalk;

import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

import javax.annotation.PreDestroy;
import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.CloseReason.CloseCodes;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import au.com.venilia.emailais.signalk.model.Delta;
import au.com.venilia.emailais.signalk.model.Subscribe;
import au.com.venilia.emailais.signalk.model.Subscribe.Format;
import au.com.venilia.emailais.signalk.model.Subscribe.Policy;
import au.com.venilia.emailais.signalk.model.Update;
import au.com.venilia.emailais.signalk.model.Value__;

@ClientEndpoint
public class SignalKClient {

    private static final Logger LOG = LoggerFactory.getLogger(SignalKClient.class);

    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    private ObjectMapper objectMapper;

    @Value("${signalk.subscription.defaultPeriodMillis:10000}")
    private int defaultPeriod;

    private Session userSession = null;

    public void subscribe(final SignalKPath path, final Optional<Integer> period, final Optional<Integer> minPeriod)
            throws JsonProcessingException {

        final Delta message = new Delta();

        message.setContext(SignalKClient.SELF);

        final Subscribe subscribe = new Subscribe();

        subscribe.setPath(path.path());
        subscribe.setPeriod(period.orElse(defaultPeriod));
        subscribe.setFormat(Format.DELTA);
        subscribe.setPolicy(Policy.INSTANT);
        if (minPeriod.isPresent())
            subscribe.setMinPeriod(minPeriod.get());

        message.setSubscribe(Collections.singletonList(subscribe));

        LOG.info("Subscribing to SignalK path {}", subscribe.getPath());

        sendMessage(message);
    }

    private void sendMessage(final Delta message) throws JsonProcessingException {

        LOG.trace("Sending message: {}", objectMapper.writeValueAsString(message));
        this.userSession.getAsyncRemote().sendText(objectMapper.writeValueAsString(message));
    }

    @OnOpen
    public void onOpen(final Session userSession) {

        this.userSession = userSession;
    }

    @OnClose
    public void onClose(final Session userSession, final CloseReason reason) {

        this.userSession = null;
        // manager.openConnection();
    }

    @OnMessage
    public void onMessage(final String message) throws JsonParseException, JsonMappingException, IOException {

        if (!message.trim().isEmpty()) {

            try {

                final Delta delta = objectMapper.readValue(message.trim().getBytes(), Delta.class);

                for (final Update update : delta.getUpdates()) {

                    for (final Value__ value : update.getValues()) {

                        try {

                            final SignalKMessageEvent event =
                                    new SignalKMessageEvent(SignalKClient.SELF, SignalKPath.fromPath(value.getPath()),
                                            value.getValueObject().orElse(value.getValue()));

                            LOG.trace("SignalK event - {}", event);

                            publisher.publishEvent(event);
                        } catch (final EnumConstantNotPresentException e) {

                            LOG.warn("Received unsupported signalK path {}", value.getPath());
                        }
                    }
                }
            } catch (final Exception e) {

                LOG.error("{} - {}", e.getMessage(), message.trim());
            }
        }
    }

    @PreDestroy
    public void destroy() {

        LOG.info(String.format("Shutting down %s", this.getClass().getSimpleName()));
        if (userSession != null && userSession.isOpen())
            try {

                userSession.close(new CloseReason(CloseCodes.NORMAL_CLOSURE, "Shutting down"));
            } catch (IOException e) {

                LOG.warn("An {} was thrown attempting to close SignalK socket - {}", e.getClass().getSimpleName(), e.getMessage());
            }
    }

    public final static String SELF = "vessels.self";

    public static enum SignalKPath {

        COG("navigation.courseOverGroundTrue", Optional.empty(), Optional.of(30000), true),
        POSITION("navigation.position", Optional.of(Value__.Position.class), Optional.of(30000), true),
        SOG("navigation.speedOverGround", Optional.empty(), Optional.of(30000), true);

        private final String path;

        private final Optional<Class<? extends Object>> objectType;

        private final Optional<Integer> minPeriod;

        private final boolean subscribe;

        SignalKPath(final String path, final Optional<Class<? extends Object>> objectType, final Optional<Integer> minPeriod,
                final boolean subscribe) {

            this.path = path;
            this.objectType = objectType;
            this.minPeriod = minPeriod;
            this.subscribe = subscribe;
        }

        public String path() {

            return path;
        }

        public Optional<Class<? extends Object>> objectType() {

            return objectType;
        }

        public Optional<Integer> getMinPeriod() {

            return minPeriod;
        }

        public boolean subscribe() {

            return subscribe;
        }

        public static SignalKPath fromPath(final String path) {

            for (final SignalKPath signalKPath : values()) {

                if (signalKPath.path().equals(path))
                    return signalKPath;
            }

            throw new EnumConstantNotPresentException(SignalKPath.class, path);
        }
    }
}
