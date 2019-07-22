package au.com.venilia.emailais;

import java.net.URI;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.apache.commons.cli.CommandLine;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import au.com.venilia.emailais.signalk.SignalKClient;
import au.com.venilia.emailais.signalk.SignalKClientManager;

@Configuration
@ComponentScan("au.com.venilia.emailais")
public class Config implements ApplicationContextAware {

    private CommandLine cli;

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {

        cli = ((CliAnnotationConfigApplicationContext) applicationContext).getCommandLine();
    }

    @Bean
    public CommandLine cli() {

        return cli;
    }

    @Bean
    public SignalKClient signalKClient() {

        return new SignalKClient();
    }

    @Bean
    public SignalKClientManager signalKClientManager(final SignalKClient signalKClient) {

        return new SignalKClientManager(signalKClient, URI.create("ws://" + cli.getOptionValue("signalk") + "/signalk/v1/stream?subscribe=none"), 1000);
    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {

        final ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();

        threadPoolTaskScheduler.setPoolSize(2);
        threadPoolTaskScheduler.setThreadNamePrefix(
                "ThreadPoolTaskScheduler");

        return threadPoolTaskScheduler;
    }

    @Bean
    public ObjectMapper objectMapper() {

        final ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.setDefaultPropertyInclusion(Include.NON_EMPTY);

        return objectMapper;
    }

    @Bean
    public Session mailSession() {

        final Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "587");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication(cli.getOptionValue(App.GMAIL_USERNAME), cli.getOptionValue(App.GMAIL_PASSWORD));
                    }
                });

        return session;
    }
}
