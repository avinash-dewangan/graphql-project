package com.graphql.learn.dao.daoImpl;

import com.graphql.learn.dao.IBookDao;
import com.graphql.learn.entity.Book;
import com.graphql.learn.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookDaoImpl implements IBookDao {

    //@Autowired
    BookRepository bookRepository;

    @Autowired
    public BookDaoImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book get(Integer bookId) {
        return bookRepository.findById(bookId).orElseThrow(()->new RuntimeException("Book Not Found"));
    }

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }
}
