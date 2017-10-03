package com.example.demo.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component
// @Primary
public class MockMailSender implements MailSender{

    private static Log log = LogFactory.getLog(MockMailSender.class);
    @Override
    public void send(String to, String subject, String body) {

        log.info("Sending MOCk email to " + to);
        log.info("With subject: " + subject);
        log.info("and body " + body);
    }

}
