package com.graphql.learn.services.serviceImpl;

import com.graphql.learn.dao.IBookDao;
import com.graphql.learn.entity.Book;
import com.graphql.learn.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    IBookDao bookDAO;


    @Override
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Override
    public Book get(Integer bookId) {
        return bookDAO.get(bookId);
    }

    @Override
    public Book create(Book book) {
        return bookDAO.create(book);
    }
}
