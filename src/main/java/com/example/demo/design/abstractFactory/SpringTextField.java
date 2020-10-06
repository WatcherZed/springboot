package com.example.demo.design.abstractFactory;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色文本框");
    }
}
