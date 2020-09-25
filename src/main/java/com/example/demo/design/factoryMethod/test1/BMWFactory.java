package com.example.demo.design.factoryMethod.test1;

public class BMWFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BMW();
    }
}
