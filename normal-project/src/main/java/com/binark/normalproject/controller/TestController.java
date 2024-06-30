package com.binark.normalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping
    public String getHello() {
        return "HELLO";
    }

    @GetMapping("/{name}")
    public String greetName(@PathVariable String name) {
        return "HELLO " + name;
    }
}
