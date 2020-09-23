package com.example.demo.design.simpleFactory.nvwaperson;

public class Robot extends Person {
    @Override
    public void getPerson() {
        System.out.println("这是一个机器人");
    }
    public void robot(){
        System.out.println("这是机器人独有的方法");
    }
}
