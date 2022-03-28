package com.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class BookLibrariseA implements Booklibar {
    Book book;


    @Override
    public Book getHttpService() {
        return book;
    }

    @Override
    public Book to(Book dependency) {
        book =dependency;
        return book;
    }
}
