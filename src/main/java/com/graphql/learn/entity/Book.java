package com.graphql.learn.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "book_tbl")
@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private Integer pages;
}
