package com.controller.SimpleAPI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EnglishMessageService implements MessageService {

    @Override
    public String welcome() {
        return "Welcome to Spring Boot !!!!";
    }

    @Override
    public String greet(String name) {
        return "Hello "+name+" ,Welcome";
    }
}
