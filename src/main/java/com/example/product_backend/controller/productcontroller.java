package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class productcontroller {

    @GetMapping("/")
    public String Home(){
        return "homepage";
    }


}
