package com.example.task.controller;

import com.example.task.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class TaskController {
    @Autowired
    HomeService homeService;

    @GetMapping("/orders")
    public String submitForm(@RequestParam("id_user") int idUser, @RequestParam("id_book") int idBook){
        return homeService.submitForm(idUser, idBook);
    }

}
