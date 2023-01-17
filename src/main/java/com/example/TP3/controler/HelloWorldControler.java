package com.example.TP3.controler;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldControler {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name + "!";
    }
}
