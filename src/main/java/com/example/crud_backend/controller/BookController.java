package com.example.crud_backend.controller;


import com.example.crud_backend.entity.Book;
import com.example.crud_backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class BookController {

    @Autowired
    private BookRepository bookrepo;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookrepo.findAll();
    }

    @PostMapping("/books")
    public Book saveBookDetails(@RequestBody Book book){
        return bookrepo.save(book);
    }

    @GetMapping("/books/{id}")
    public Book getSingleBook(@PathVariable Long id){
        return bookrepo.findById(id).get();
    }

    @PutMapping("/books")
    public Book updateBookDetails(@RequestBody Book book){
        return bookrepo.save(book);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<HttpStatus> deleteBookById(@PathVariable Long id){
        bookrepo.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}

