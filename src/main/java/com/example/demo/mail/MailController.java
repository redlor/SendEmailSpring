package com.example.demo.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {

    private MailSender mailSender;

    public MailController( MailSender smtp) {
        this.mailSender = smtp;
    }

    @RequestMapping("/mail")
    public String mail() throws MessagingException, com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException {

        mailSender.send("redlor1983@gmail.com", "Test mail", "This is a test");
        return "Mail sent";
    }
}
