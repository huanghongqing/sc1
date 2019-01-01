package com.tdy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sccontroller1 {
    @RequestMapping("/new1")
    public String new1(){
        return "new11";
    }
}
