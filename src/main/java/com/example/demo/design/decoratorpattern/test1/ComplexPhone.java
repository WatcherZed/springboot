package com.example.demo.design.decoratorpattern.test1;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:25
 */
public class ComplexPhone extends Phone {
    public ComplexPhone(){
        System.out.println("这是一个很神奇的手机");
    }

    @Override
    public void type() {
        System.out.println("神奇手机");
    }
}
