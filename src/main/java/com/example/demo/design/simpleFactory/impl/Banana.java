package com.example.demo.design.simpleFactory.impl;

import com.example.demo.design.simpleFactory.Fruit;

public class Banana extends Fruit {
    @Override
    public void privateMethod() {
        System.out.println("香蕉是黄色的!");
    }
}
