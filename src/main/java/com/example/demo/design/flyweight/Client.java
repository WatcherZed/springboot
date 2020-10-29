package com.example.demo.design.flyweight;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/29 19:36
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight a = flyweightFactory.getFlyweight("黑棋");
        a.operation("A");
        Flyweight b = flyweightFactory.getFlyweight("白旗");
        b.operation("B");
        System.out.println(a==b);
    }
}
