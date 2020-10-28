package com.example.demo.design.decoratorpattern.test1;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:13
 */
public class SimplePhone extends Phone {
    public SimplePhone(){
        System.out.println("这是一个普普通通的手机");
    }

    @Override
    public void type() {
        System.out.println("普普通通");
    }
}
