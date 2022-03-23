package com.demo;


import com.demo.entity.BookLibrarise;
import com.demo.entity.BookLibrariseA;
import com.demo.entity.Book;
import com.demo.entity.Booklibar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AwesomeConteneur {
    @Autowired
    BookLibrarise bookLibrarise;
    @Autowired
    BookLibrariseA bookLibrariseA;
     @Autowired
    AwesomeConteneur conteneur;


    Booklibar newInstance(Booklibar dependency){

        return dependency;
    }
    Booklibar bind(Booklibar dependency){

       return dependency;

    }

}
