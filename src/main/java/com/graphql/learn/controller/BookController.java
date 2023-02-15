package com.graphql.learn.controller;

import com.graphql.learn.entity.Book;
import com.graphql.learn.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    public IBookService iBookService;

    @GetMapping("/allBooks")
    public List<Book> getAllBooks(){
        return iBookService.getAllBooks();
    }

    @PostMapping("/create")
    public Book create(@RequestBody Book book){
        return iBookService.create(book);
    }
    //@GetMapping("/{bookId}")
    @GetMapping("/getBook")
    public Book getBook(@Argument Integer bookId){
        return iBookService.get(bookId);
    }
}
