package com.example.orrder.service;

import com.example.orrder.model.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Orders addOrder(Orders orders);
    List<Orders> getOrders();
}
