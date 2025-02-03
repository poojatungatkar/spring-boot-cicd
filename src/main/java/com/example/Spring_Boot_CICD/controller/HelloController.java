package com.example.Spring_Boot_CICD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/welcome")
    public String getMessage()
    {
        return  "welcome to spring boot ci/cd";
    }
}
