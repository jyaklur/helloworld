package com.yaklur.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloworldController {

    @GetMapping
    public String helloWorld(){
        return "<HELLO WORLD!>";
    }
}
