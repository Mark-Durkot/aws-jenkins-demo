package com.example.awsjenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces = "application/json")
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome to AWS deployed by Jenkins";
    }

}
