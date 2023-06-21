package com.gihanz.controllers;

import com.gihanz.entities.Book;
import com.gihanz.repositories.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
@CrossOrigin
public class BookController {

    private final BookRepository  bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Book create(@RequestBody Book book){
       return bookRepository.save(book);
    }
    @GetMapping
    public List<Book> getAll(){
        return bookRepository.findAll();
    }
}
