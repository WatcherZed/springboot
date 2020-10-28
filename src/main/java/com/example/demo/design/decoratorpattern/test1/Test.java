package com.example.demo.design.decoratorpattern.test1;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:14
 */
public class Test {
    public static void main(String[] args) {
        Phone voice = new Voice(new SimplePhone());
        Phone vibration = new Vibration(voice);
        vibration.call();
        System.out.println("------------------");
        Phone newPhone = new Twinkle(new Vibration(new Voice(new ComplexPhone())));
        newPhone.call();
    }
}
