package com.cinel.orderflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String inicio() {
        return "ORDERFLOW funcionando!";
    }
}
