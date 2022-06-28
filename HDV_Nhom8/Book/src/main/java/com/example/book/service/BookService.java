package com.example.book.service;

import com.example.book.model.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    Book getBookByID(int id);
}
