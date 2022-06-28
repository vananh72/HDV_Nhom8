package com.example.user.service;

import com.example.user.model.User;
import com.example.user.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserByID(int id) {

        Optional<User> op = userRepository.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        return null;
    }
}
