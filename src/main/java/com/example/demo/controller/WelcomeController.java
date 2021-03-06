package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sahosoft")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WelcomeController {

    @GetMapping("/welcome")
    public String getWelcomeMessage(){
        return "Welcome to Sahosoft Class";
    }

}
