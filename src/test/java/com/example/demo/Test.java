package com.example.demo;

import com.example.demo.test.service.Intervice;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

public class Test {
    @Autowired
    private SpringbootApplicationTests springbootApplicationTests;


    public static void main(String[] args) {
        Mono.just("Craig")
                .map(String::toUpperCase)
                .map(cn -> {
                    String s = "刘永康";
                    return "hello, " + s + cn + "!";
                })
                .subscribe(a -> System.out.println(a));
    }
}
