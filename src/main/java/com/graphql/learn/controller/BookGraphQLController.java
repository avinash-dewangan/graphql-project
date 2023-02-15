package com.graphql.learn.controller;

import com.graphql.learn.entity.Book;
import com.graphql.learn.services.IBookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BookGraphQLController {
    @Autowired
    public IBookService iBookService;

    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return iBookService.getAllBooks();
    }


    @MutationMapping("createBook")
    public Book create(@Argument BookInsert book){

        Book book1 = new Book();
        book1.setTitle(book.getTitle());
        book1.setAuthor(book.getAuthor());
        book1.setDesc(book.getDesc());
        book1.setPrice(book.getPrice());
        book1.setPages(book.getPages());
        return iBookService.create(book1);
    }

    @QueryMapping("getBook")
    public Book getBook(@Argument Integer bookId){
        return iBookService.get(bookId);
    }

}

@Setter
@Getter
class BookInsert{
    private String title;
    private String desc;
    private String author;
    private double price;
    private Integer pages;
}
