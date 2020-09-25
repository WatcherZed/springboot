package com.example.demo.design.factoryMethod.test1;

public class Test {
    public static void main(String[] args) {
        CarFactory benzFactory = new BenzFactory();
        Car car = benzFactory.getCar();
        car.pinpai();
        car.use();
        ((Benz)car).benz();
    }
}
