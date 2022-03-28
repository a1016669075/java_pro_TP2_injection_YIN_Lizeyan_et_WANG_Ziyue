package com.demo;


import com.demo.entity.HttpService;
import com.demo.entity.NewsService;
import com.demo.entity.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AwesomeConteneur {
    @Autowired
    HttpService httpService;
    @Autowired
    NewsService newsService;
     @Autowired
    AwesomeConteneur conteneur;


    Service newInstance(Service dependency){

        return dependency;
    }
    Service bind(Service dependency){

       return dependency;

    }

}
