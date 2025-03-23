package com.codekul.springbatch.controller;

import com.codekul.springbatch.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/sayhello")
    public String sayHello(){
        return helloService.sayHello();
    }
//http://localhost:8080/hello/sayhello
}
