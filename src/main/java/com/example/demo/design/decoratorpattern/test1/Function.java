package com.example.demo.design.decoratorpattern.test1;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:16
 */
public class Function extends Phone {
    Phone phone;
    public Function(Phone phone){
        this.phone = phone;
    }
    public void call(){
        phone.call();
    }

    @Override
    public void type() {
        phone.type();
    }
}
