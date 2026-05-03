package com.nt.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public String greetMessage() {
        return "Welcome to Spring Boot REST API!";
    }
}
