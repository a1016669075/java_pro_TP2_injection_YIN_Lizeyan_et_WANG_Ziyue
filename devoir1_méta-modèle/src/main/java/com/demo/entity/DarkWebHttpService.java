package com.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class DarkWebHttpService implements Service {

    @Override
    public Service to(Service dependency) {
        return null;
    }

    @Override
    public Service getHttpService() {
        return null;
    }
}
