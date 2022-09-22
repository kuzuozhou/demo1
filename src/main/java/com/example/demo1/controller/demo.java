package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        return "hello springboot";
    }
}
