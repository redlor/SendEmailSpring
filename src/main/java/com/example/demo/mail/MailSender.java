package com.example.demo.mail;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

public interface MailSender {

    void send(String to, String subject, String body) throws MessagingException, javax.mail.MessagingException;


}
