package au.com.venilia.emailais;

import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

public class App {

    public final static String SIGNALK = "signalk";
    public final static String MMSI = "mmsi";
    public final static String GMAIL_USERNAME = "gmailUser";
    public final static String GMAIL_PASSWORD = "gmailPassword";
    public final static String REPORT_FREQUENCY = "frequency";
    public final static String REPORT_SENDER = "sender";
    public final static String REPORT_RECIPIENT = "recipient";

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    private static volatile boolean run = true;

    private final CliAnnotationConfigApplicationContext ctx;

    public App(final CommandLine commandLine) throws IOException {

        ctx = new CliAnnotationConfigApplicationContext(commandLine);
        ctx.register(Config.class);
        ctx.refresh();

        final Thread runThread = new Thread() {

            @Override
            public void run() {

                try {

                    while (run)
                        Thread.sleep(2000);

                    ctx.stop();
                } catch (final Exception ex) {

                    System.err.println("Failed to stop App");
                }
            }
        };

        runThread.start();
        try {

            runThread.join();
        } catch (InterruptedException e) {

            System.out.println("Run thread died");
        }
    }

    public void stop() {

        run = false;
    }

    public ApplicationContext getApplicationContext() {

        return ctx;
    }

    public static void main(String... args) throws ParseException {

        System.out.println("=============");
        System.out.println("= EmailAIS !=");
        System.out.println("=============");

        try {

            LOG.info("Launching Email AIS");
            new App(parseCliArguments(args));
        } catch (final ParseException | IOException parseException) {

            System.exit(-1);
        }
    }

    private static CommandLine parseCliArguments(String... args) throws ParseException {

        final Options options = new Options();

        final Option a = new Option("k", SIGNALK, true, "ex: --" + SIGNALK + " host:port");
        a.setRequired(true);
        options.addOption(a);

        final Option b = new Option("i", MMSI, true, "ex: --" + MMSI + " 123456789");
        b.setRequired(true);
        options.addOption(b);

        final Option c = new Option("u", GMAIL_USERNAME, true, "ex: --" + GMAIL_USERNAME + " joe@gmail.com");
        c.setRequired(true);
        options.addOption(c);

        final Option d = new Option("p", GMAIL_PASSWORD, true, "ex: --" + GMAIL_PASSWORD + " ks34P%j_8");
        d.setRequired(true);
        options.addOption(d);

        final Option e = new Option("f", REPORT_FREQUENCY, true, "ex: --" + REPORT_FREQUENCY + " 120 (seconds; defaults to 60)");
        e.setRequired(false);
        options.addOption(e);

        final Option f = new Option("s", REPORT_SENDER, true,
                "ex: --" + REPORT_SENDER + " joe@gmail.com (defaults to value from " + GMAIL_USERNAME + " parmeter)");
        f.setRequired(false);
        options.addOption(f);

        final Option g = new Option("r", REPORT_RECIPIENT, true,
                "ex: --" + REPORT_RECIPIENT + " joe+test@gmail.com (defaults to report@marinetraffic.com)");
        g.setRequired(false);
        options.addOption(g);

        final CommandLineParser parser = new DefaultParser();
        final HelpFormatter formatter = new HelpFormatter();

        try {

            final CommandLine commandLine = parser.parse(options, args);
            return commandLine;
        } catch (final ParseException pe) {

            System.out.println(String.format("Invalid parameters - %s", pe.getMessage()));
            formatter.printHelp("java -jar EmailAIS-[version].jar <options>", options);
            throw pe;
        }
    }
}
