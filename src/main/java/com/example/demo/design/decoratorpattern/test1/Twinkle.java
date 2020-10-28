package com.example.demo.design.decoratorpattern.test1;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:25
 */
public class Twinkle extends Function {
    public Twinkle(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        this.twinkle();
    }
    public void twinkle(){
        System.out.println("灯光闪烁提示");
    }
}
