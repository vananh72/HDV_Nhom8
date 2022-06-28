package com.example.orrder.controller;

import com.example.orrder.model.Book;
import com.example.orrder.model.Orders;
import com.example.orrder.model.User;
import com.example.orrder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public Orders addOrders(@RequestBody Orders orders) {
        Orders o = orderService.addOrder(orders);
        return o;
    }

    @GetMapping("/list")
    public List<Orders> listOrders(){
        return orderService.getOrders();
    }

}
