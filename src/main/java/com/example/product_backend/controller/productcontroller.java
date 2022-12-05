package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class productcontroller {

    @GetMapping("/")
    public String Home(){
        return "homepage";
    }

    @PostMapping("/add")
    public String add(){
        return "add";
    }

    @PostMapping("/search")
    public String search(){
        return "search";
    }

    @PostMapping("/edit")
    public String edit(){
        return "edit";
    }


}
