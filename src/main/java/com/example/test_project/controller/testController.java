package com.example.test_project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping
    public String demo() {
        return "THis is a test";
    }
}
