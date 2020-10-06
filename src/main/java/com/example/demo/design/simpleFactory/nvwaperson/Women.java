package com.example.demo.design.simpleFactory.nvwaperson;

public class Women extends Person {
    @Override
    public void getPerson() {
        System.out.println("这是一个女人");
    }
    public void women(){
        System.out.println("这是女人独有的方法");
    }
}
