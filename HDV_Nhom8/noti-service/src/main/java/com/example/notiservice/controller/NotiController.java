package com.example.notiservice.controller;


import com.example.notiservice.model.Orders;
import com.example.notiservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotiController {

    @Autowired
    private EmailService emailService;

    @PostMapping("")
    public String sendMail(@RequestBody Orders orders){
        String subject = "Hello, "+ orders.getUser().getName() +"\n";

        String content = "Your orders success, book's name is: " + orders.getBook().getName()+"\n"
                +"Thanks you!"
                ;

        emailService.sendMail(orders.getUser().getGmail(), subject, content);
        return "ok";
    }

}
