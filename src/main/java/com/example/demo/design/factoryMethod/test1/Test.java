package com.example.demo.design.factoryMethod.test1;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = XMLUtil.getBean();
        Car car = carFactory.getCar();
        car.pinpai();
        car.use();
//        ((Benz)car).benz();
    }
}
