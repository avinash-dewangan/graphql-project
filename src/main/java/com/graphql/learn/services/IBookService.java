package com.graphql.learn.services;

import com.graphql.learn.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();
    //Get Single Book
    Book get(Integer bookId);

    //create
    Book create(Book book);
}
