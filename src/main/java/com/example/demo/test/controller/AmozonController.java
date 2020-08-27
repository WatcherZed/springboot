package com.example.demo.test.controller;

import com.example.demo.test.config.AmozonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class AmozonController {

    private AmozonProperties amozonProperties;

    @Autowired
    public AmozonController(AmozonProperties amozonProperties) {
        this.amozonProperties = amozonProperties;
    }

    @GetMapping("/test")
    public String test(){
        String amozonID = amozonProperties.getAmozonID();
        System.out.println(amozonID);
        return "home";
    }
}
