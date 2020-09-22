package com.example.demo.design.simpleFactory.impl;

import com.example.demo.design.simpleFactory.Fruit;

public class Apple extends Fruit {
    @Override
    public void privateMethod() {
        System.out.println("苹果是红色的!");
    }
}
