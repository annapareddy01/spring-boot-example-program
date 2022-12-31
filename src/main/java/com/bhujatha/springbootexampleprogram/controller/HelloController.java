package com.bhujatha.springbootexampleprogram.controller;

import com.bhujatha.springbootexampleprogram.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/test/{name1}")
    public String testPathVariable(@PathVariable("name1") String name){
        return "@PathVariable is user to read the data from URL using "+name;
    }

    @GetMapping("/test")
    public String testRequestParam(@RequestParam String name){
        return "@RequestParam is used to passed the data using QueryParam ?key = value "+name;
    }
    @GetMapping("/testrp1")
    public String testRequestParam(@RequestParam String name,@RequestParam(name="emailId",required = false) String email){
        return "@RequestParam is used to passed the data using QueryParam ?key = value "+name+"  "+email;
    }
    //sample url :http://localhost:8080/testrp1?name=Bhujatha&emailId=bhujatha@gmail.com

    @GetMapping("/testrp12")
    public String testRequestParamwithDefaultValue(@RequestParam String name,@RequestParam(name="emailId",required = false,defaultValue = "") String email){
        return "@RequestParam with default value Name is "+name+"   and Email ID is "+email;
    }

}
