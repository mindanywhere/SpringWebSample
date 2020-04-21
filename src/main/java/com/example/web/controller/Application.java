package com.example.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.pojo.User;

@RestController
public class Application {
    @RequestMapping("/")
    public String index() {
        return "Index Page";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    
    @RequestMapping("/pojo")
    public User pojo() {
    	User u=new User();
    	u.setId(0);
    	u.setName("龙龙哥");
        return u;
    }
}