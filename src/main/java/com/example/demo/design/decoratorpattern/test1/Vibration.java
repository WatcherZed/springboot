package com.example.demo.design.decoratorpattern.test1;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:22
 */
public class Vibration extends Function {
    public Vibration(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        this.vibration();
    }
    public void vibration(){
        System.out.println("手机振动");
    }
}
