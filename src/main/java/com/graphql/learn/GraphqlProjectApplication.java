package com.graphql.learn;

import com.graphql.learn.entity.Book;
import com.graphql.learn.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private IBookService iBookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1= new Book();
		b1.setTitle("Java Beginner");
		b1.setAuthor("Avinash Dewangan");
		b1.setDesc("Java");
		b1.setPrice(150.00);
		b1.setPages(123);

		Book b2= new Book();
		b2.setTitle("JavaScript Beginner");
		b2.setAuthor("Avinash Dewangan");
		b2.setDesc("JavaScript");
		b2.setPrice(100.00);
		b2.setPages(100);

		Book b3= new Book();
		b3.setTitle("NodeJs Beginner");
		b3.setAuthor("Amit");
		b3.setDesc("Node Js");
		b3.setPrice(500.00);
		b3.setPages(200);

		this.iBookService.create(b1);
		this.iBookService.create(b2);
		this.iBookService.create(b3);
	}
}
