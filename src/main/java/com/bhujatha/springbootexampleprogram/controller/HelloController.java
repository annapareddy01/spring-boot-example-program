package com.bhujatha.springbootexampleprogram.controller;

import com.bhujatha.springbootexampleprogram.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World!!";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("Bhujatha");
        user.setEmailId("bhujatha92@gmail.com");
        return user;
    }
}
