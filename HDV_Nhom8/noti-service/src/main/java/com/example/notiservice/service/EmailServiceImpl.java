package com.example.notiservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender sender;

    public void sendMail(String to, String subject, String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("kimvananh0702@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        sender.send(message);
        System.out.println("SEND OK");
    }
}
