package com.example.demo.design.decoratorpattern.test2;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:49
 */
public class Milk extends Mixed {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",牛奶";
    }

    @Override
    public int getCost() {
        return super.getCost()+6;
    }
}
