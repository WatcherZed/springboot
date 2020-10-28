package com.example.demo.design.decoratorpattern.test2;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:48
 */
public class Whip extends Mixed {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",奶泡";
    }

    @Override
    public int getCost() {
        return super.getCost()+8;
    }
}
