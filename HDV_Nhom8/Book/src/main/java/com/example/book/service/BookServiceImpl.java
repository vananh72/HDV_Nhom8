package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book getBookByID(int id) {

        Optional<Book> op = bookRepository.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        return null;
    }
}
