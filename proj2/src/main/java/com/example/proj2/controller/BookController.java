package com.example.proj2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj2.entity.Book;
import com.example.proj2.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    public BookService bookService;

    @PostMapping("/create")
    public void createBook(@RequestBody Book book){
        bookService.createBook(book);
    }

    @GetMapping("/get")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
