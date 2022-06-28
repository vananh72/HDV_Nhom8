package com.example.notiservice.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    void sendMail(String to, String title, String text);
}
