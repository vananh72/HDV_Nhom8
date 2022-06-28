package com.example.task.api;

import com.example.task.model.Book;
import com.example.task.model.Orders;
import com.example.task.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallIPI {

    @Autowired
    RestTemplate restTemplate;

    public Book getBookByID(int id) {
        Book book = restTemplate.getForObject("http://book-service" + "/book/{id}", Book.class, id);
        return book;
    }

    public User getUserByID(int id) {
        User u = restTemplate.getForObject("http://user-service" + "/user/{id}", User.class, id);
        return u;
    }

    public Orders saveOrders(Orders orders){
        Orders o = restTemplate.postForObject("http://order-service"+"/orders/add",orders,
                Orders.class);
        return o;
    }

    public String sendMail(Orders orders){
        String s = restTemplate.postForObject("http://noti-service"+"/notification",orders, String.class);
        return s;
    }


}
