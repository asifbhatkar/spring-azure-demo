package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

    private Book book;
    private Author author;

    @Autowired
    public Library(Book book, Author author) {
        System.out.println("Library object created");
        this.book = book;
        this.author = author;
    }
}
