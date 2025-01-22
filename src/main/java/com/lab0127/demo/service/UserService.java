package com.lab0127.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String handleHello() {
        return "Hello From Service";
    }
}
