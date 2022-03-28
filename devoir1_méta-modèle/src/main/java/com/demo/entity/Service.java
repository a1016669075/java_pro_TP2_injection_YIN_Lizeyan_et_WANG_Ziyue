package com.demo.entity;

import com.demo.AwesomeConteneur;

public interface Service {
    Service to(Service dependency);
    Service  getHttpService();
}
