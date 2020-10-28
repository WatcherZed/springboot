package com.example.demo.design.decoratorpattern.test;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:04
 */
public class Client {
    public static void main(String[] args) {
        Component component,component1;
        component = new Window();
        component1 = new ScrollBarDecorator(component);
//        component1.display();
        component1 = new BlackBorderDecorator(component1);
        component1.display();
    }
}
