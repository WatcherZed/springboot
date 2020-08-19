package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;


public class Test {
    @Autowired
    private SpringbootApplicationTests springbootApplicationTests;


    public static void main(String[] args) {
        Test test = new Test();
        test.springbootApplicationTests.whatPeople();
    }
}
