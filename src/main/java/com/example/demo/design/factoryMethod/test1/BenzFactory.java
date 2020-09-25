package com.example.demo.design.factoryMethod.test1;

public class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
