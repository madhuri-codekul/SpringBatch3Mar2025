package com.codekul.springbatch.service.impl;

import com.codekul.springbatch.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello World!!!";
    }
}
