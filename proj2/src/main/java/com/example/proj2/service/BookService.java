package com.example.proj2.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.proj2.entity.Book;
import com.example.proj2.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void createBook(Book book){
        bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
