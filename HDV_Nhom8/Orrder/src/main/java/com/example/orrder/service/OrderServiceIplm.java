package com.example.orrder.service;

import com.example.orrder.model.Book;
import com.example.orrder.model.Orders;
import com.example.orrder.model.User;
import com.example.orrder.repo.OrdersRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceIplm implements OrderService{

    @Autowired
    OrdersRepository orderRepository;

    @Override
    public Orders addOrder(Orders orders) {
        return  orderRepository.save(orders);
    }

    @Override
    public List<Orders> getOrders() {
        List<Orders> list = orderRepository.findAll();
        return list;
    }
}
