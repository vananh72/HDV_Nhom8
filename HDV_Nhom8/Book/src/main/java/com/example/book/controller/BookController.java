package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") int id){
        Book b = bookService.getBookByID(id);
        return b;
    }

}
