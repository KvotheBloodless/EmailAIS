package au.com.venilia.emailais.signalk.service.impl;

import static au.com.venilia.emailais.signalk.util.Converter.metersPerSecondToKnots;
import static au.com.venilia.emailais.signalk.util.Converter.radianToDegrees;
import static au.com.venilia.emailais.signalk.util.Converter.roundToNDigits;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.cli.CommandLine;
import org.javatuples.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;

import au.com.venilia.emailais.App;
import au.com.venilia.emailais.signalk.SignalKMessageEvent;
import au.com.venilia.emailais.signalk.model.Value__;
import au.com.venilia.emailais.signalk.service.EmailReportService;

@Service
public class EmailReportServiceImpl implements EmailReportService {

    private static final Logger LOG = LoggerFactory.getLogger(EmailReportServiceImpl.class);

    @Autowired
    private CommandLine cli;

    @Autowired
    private TaskScheduler taskScheduler;

    @Autowired
    private Session mailSession;

    static Pair<Pair<Double, Double>, Instant> latestPOSITION;

    static Pair<Double, Instant> latestSOG;

    static Pair<Integer, Instant> latestCOG;

    @PostConstruct
    private void init() {

        short reportFrequencySeconds = 60;

        try {

            reportFrequencySeconds = Short.parseShort(cli.getOptionValue(App.REPORT_FREQUENCY));
        } catch (NumberFormatException nfe) {

            LOG.info("Reporting frequency not supplied or invalid. Defaulting to 60.");
        }

        String reportFrom = cli.getOptionValue(App.GMAIL_USERNAME);
        if (cli.getOptionValue(App.REPORT_SENDER) != null)
            reportFrom = cli.getOptionValue(App.REPORT_SENDER);

        String reportTo = "report@marinetraffic.com";
        if (cli.getOptionValue(App.REPORT_RECIPIENT) != null)
            reportFrom = cli.getOptionValue(App.REPORT_RECIPIENT);

        taskScheduler.scheduleAtFixedRate(
                new SendEmailTask(cli.getOptionValue(App.MMSI),
                        reportFrom,
                        reportTo,
                        mailSession,
                        reportFrequencySeconds * 1000),
                reportFrequencySeconds * 1000);
    }

    @EventListener(
            condition = "#event.path == T(au.com.venilia.emailais.signalk.SignalKClient.SignalKPath).SOG.path()")
    public void handleEventSOG(
            final SignalKMessageEvent event) {

        latestSOG = Pair.with(
                metersPerSecondToKnots(Double.parseDouble(((String) event.getValue()))),
                Instant.now());
    }

    @EventListener(condition = "#event.path == T(au.com.venilia.emailais.signalk.SignalKClient.SignalKPath).COG.path()")
    public void handleEventCOG(final SignalKMessageEvent event) {

        latestCOG = Pair.with(
                radianToDegrees(Double.parseDouble(((String) event.getValue()))),
                Instant.now());
    }

    @EventListener(condition = "#event.path == T(au.com.venilia.emailais.signalk.SignalKClient.SignalKPath).POSITION.path()")
    public void handleEventPOSITION(final SignalKMessageEvent event) {

        latestPOSITION = Pair.with(
                Pair.with(((Value__.Position) event.getValue()).getLatitude(),
                        ((Value__.Position) event.getValue()).getLongitude()),
                Instant.now());
    }

    static class SendEmailTask implements Runnable {

        private final static DateTimeFormatter TIMESTAMP_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
                .withZone(ZoneId.of("UTC"));

        private final String mmsi;

        private final String reportFrom;

        private final String reportTo;

        private final Session session;

        private final long reportFrequencyMillis;

        public SendEmailTask(final String mmsi, final String reportFrom, final String reportTo, final Session session,
                final long reportFrequencyMillis) {

            this.mmsi = Objects.requireNonNull(mmsi);
            this.reportFrom = reportFrom;
            this.reportTo = reportTo;
            this.session = session;
            this.reportFrequencyMillis = reportFrequencyMillis;
        }

        @Override
        public void run() {

            if (latestPOSITION != null && latestSOG != null && latestCOG != null) {

                final Instant threshold = Instant.now().minusMillis(reportFrequencyMillis);

                if (latestPOSITION.getValue1().isAfter(threshold)
                        && latestSOG.getValue1().isAfter(threshold)
                        && latestCOG.getValue1().isAfter(threshold)) {

                    final StringBuffer emailBuilder = new StringBuffer();

                    emailBuilder.append("MMSI=" + mmsi + "\n");
                    emailBuilder.append("LAT=" + latestPOSITION.getValue0().getValue0() + "\n");
                    emailBuilder.append("LON=" + latestPOSITION.getValue0().getValue1() + "\n");
                    emailBuilder.append("SPEED=" + (roundToNDigits(latestSOG.getValue0(), 1) == 0 ? "-" : latestSOG.getValue0()) + "\n");
                    emailBuilder.append("COURSE=" + (roundToNDigits(latestSOG.getValue0(), 1) == 0 ? "-" : latestCOG.getValue0()) + "\n");
                    emailBuilder.append("TIMESTAMP=" + TIMESTAMP_FORMATTER.format(latestPOSITION.getValue1()));

                    try {

                        final Message message = new MimeMessage(session);

                        message.setFrom(new InternetAddress(reportFrom));
                        message.setRecipients(
                                Message.RecipientType.TO,
                                InternetAddress.parse(reportTo));
                        message.setText(emailBuilder.toString());

                        Transport.send(message);

                        LOG.debug("Successfully dispatched report");

                    } catch (final MessagingException e) {

                        LOG.error("Could not dispatch report {}", e.getMessage(), e);
                    }
                } else
                    LOG.warn("Data from source is stale");
            } else
                LOG.warn("No data from source yet");
        }
    }
}
