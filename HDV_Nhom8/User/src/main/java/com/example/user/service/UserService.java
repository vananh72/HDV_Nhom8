package com.example.user.service;

import com.example.user.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User getUserByID(int id);

}
