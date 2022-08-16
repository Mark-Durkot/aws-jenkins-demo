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

    @GetMapping("/home2")
    public String home2() {
        return "Ohh shit this is home 2";
    }

    @GetMapping("/home3")
    public String home3() {
        return "Oh shit this is home 3";
    }

}
