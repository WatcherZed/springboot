package com.example.demo.design.simpleFactory.nvwaperson;

public class Man extends Person {
    @Override
    public void getPerson() {
        System.out.println("这是一个男人");
    }
    public void man(){
        System.out.println("这是男人独有的方法");
    }
}
