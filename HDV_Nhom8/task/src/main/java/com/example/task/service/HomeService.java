package com.example.task.service;

import com.example.task.model.Orders;
import org.springframework.stereotype.Service;

@Service
public interface HomeService {

    String submitForm(int id_user, int id_book);

}
