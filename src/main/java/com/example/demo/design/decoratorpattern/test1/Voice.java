package com.example.demo.design.decoratorpattern.test1;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:18
 */
public class Voice extends Function {
    public Voice(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.type();
        super.call();
        this.voice();
    }
    public void voice(){
        System.out.println("来电提示");
    }
}
