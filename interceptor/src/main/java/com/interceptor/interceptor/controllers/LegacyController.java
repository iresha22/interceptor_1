package com.interceptor.interceptor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("legacy")
public class LegacyController {

    @GetMapping("/")
    public String displayText(){
        return "This is just old code";
    }
}
