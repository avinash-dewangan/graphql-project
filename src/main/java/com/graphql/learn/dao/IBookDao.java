package com.graphql.learn.dao;

import com.graphql.learn.entity.Book;

import java.util.List;

public interface IBookDao {

    //Get ALL Books
    List<Book> getAllBooks();

    //Get Single Book
    Book get(Integer bookId);

    //create
    Book create(Book book);



}
