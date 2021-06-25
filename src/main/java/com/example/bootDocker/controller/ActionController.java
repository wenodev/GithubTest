package com.example.bootDocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    @GetMapping("/action")
    public String helloAction(){
        return "Hello, Action!";
    }

}
