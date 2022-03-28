package com.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewsService implements Service{
    Service service;


    @Override
    public Service getHttpService() {
        return service;
    }

    @Override
    public Service to(Service dependency) {
        service=dependency;
        return service;
    }
}
