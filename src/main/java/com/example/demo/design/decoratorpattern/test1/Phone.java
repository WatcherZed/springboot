package com.example.demo.design.decoratorpattern.test1;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:12
 */
public abstract class Phone {
    public void call(){
        System.out.println("接收来电");
    }
    public abstract void type();
}
