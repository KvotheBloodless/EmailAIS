
package au.com.venilia.emailais.signalk.model;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import au.com.venilia.emailais.signalk.SignalKClient;
import au.com.venilia.emailais.signalk.SignalKClient.SignalKPath;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(using = Value__.Deserializer.class)
public class Value__ {

    @JsonProperty("path")
    private String path;

    private String value;

    private Optional<Object> valueObject = Optional.empty();

    @JsonProperty("path")
    public String getPath() {

        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {

        this.path = path;
    }

    public SignalKClient.SignalKPath type() {

        return SignalKPath.fromPath(getPath());
    }

    @JsonProperty("value")
    public String getValue() {

        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {

        this.value = value;
    }

    public Optional<Object> getValueObject() {

        return valueObject;
    }

    public void setValueObject(final Optional<Object> valueObject) {

        this.valueObject = valueObject;
    }

    @Override
    public String toString() {

        return new ToStringBuilder(this).append("path", path)
                .append("value", value)
                .append("valueObject", valueObject)
                .toString();
    }

    public static class Deserializer extends StdDeserializer<Value__> {

        public Deserializer() {

            this(null);
        }

        public Deserializer(Class<?> vc) {

            super(vc);
        }

        @Override
        public Value__ deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException {

            final JsonNode node = jp.getCodec().readTree(jp);

            final Value__ item = new Value__();

            item.setPath(node.get("path").textValue());

            if (node.get("value").isObject()) {

                if (item.type().objectType().isPresent())
                    item.setValueObject(Optional.of(jp.getCodec().readValue(node.get("value").traverse(), item.type().objectType().get())));
                else
                    throw new UnsupportedOperationException(
                            String.format("Don't have a value type configured for path %s - %s", item.getPath(),
                                    node.get("value").asText()));
            } else if (node.get("value").isDouble())
                item.setValue(Double.toString(node.get("value").doubleValue()));
            else if (node.get("value").isInt())
                item.setValue(Integer.toString(node.get("value").intValue()));

            return item;
        }
    }

    public static class ValueObject {

        private final String state;

        private final java.util.List<String> method;

        private final String message;

        @JsonCreator
        public ValueObject(@JsonProperty("state") final String state, @JsonProperty("method") java.util.List<String> method,
                @JsonProperty("message") final String message) {

            this.state = state;
            this.method = method;
            this.message = message;
        }

        public String getState() {

            return state;
        }

        public java.util.List<String> getMethod() {

            return method;
        }

        public String getMessage() {

            return message;
        }

        @Override
        public String toString() {

            return ToStringBuilder.reflectionToString(this);
        }
    }

    public static class Position {

        private final double longitude;

        private final double latitude;

        @JsonCreator
        public Position(@JsonProperty("longitude") final double longitude, @JsonProperty("latitude") final double latitude) {

            this.longitude = longitude;
            this.latitude = latitude;
        }

        public double getLatitude() {

            return latitude;
        }

        public double getLongitude() {

            return longitude;
        }

        @Override
        public String toString() {

            return ToStringBuilder.reflectionToString(this);
        }
    }

    public static class Attitude {

        private final double yaw;

        private final double pitch;

        private final double roll;

        @JsonCreator
        public Attitude(@JsonProperty("yaw") final double yaw, @JsonProperty("pitch") final double pitch,
                @JsonProperty("roll") final double roll) {

            this.yaw = yaw;
            this.pitch = pitch;
            this.roll = roll;
        }

        public double getYaw() {

            return yaw;
        }

        public double getPitch() {

            return pitch;
        }

        public double getRoll() {

            return roll;
        }

        @Override
        public String toString() {

            return ToStringBuilder.reflectionToString(this);
        }
    }

    public static class Notification {

        public final Set<Method> methods;

        public final State state;

        public final String message;

        @JsonCreator
        public Notification(@JsonProperty("method") final Set<Method> methods, @JsonProperty("state") final State state,
                @JsonProperty("message") final String message) {

            this.methods = methods;
            this.state = state;
            this.message = message;
        }

        public Set<Method> getMethods() {

            return methods;
        }

        public State getState() {

            return state;
        }

        public String getMessage() {

            return message;
        }

        public static enum Method {

            VISUAL("visual"),
            SOUND("sound");

            private final String value;

            Method(final String value) {

                this.value = value;
            }

            @JsonCreator
            public static Method fromValue(final String value) {

                for (final Method method : values())
                    if (method.value.equals("value"))
                        return method;

                throw new EnumConstantNotPresentException(Method.class, value);
            }
        }

        public static enum State {

            ALARM("alarm"),
            EMERGENCY("emergency");

            private final String value;

            State(final String value) {

                this.value = value;
            }

            @JsonCreator
            public static State fromValue(final String value) {

                for (final State state : values())
                    if (state.value.equals("value"))
                        return state;

                throw new EnumConstantNotPresentException(State.class, value);
            }
        }
    }
}
