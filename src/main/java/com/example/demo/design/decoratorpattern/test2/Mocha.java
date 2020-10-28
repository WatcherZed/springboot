package com.example.demo.design.decoratorpattern.test2;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:43
 */
public class Mocha extends Mixed {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",摩卡";
    }

    @Override
    public int getCost() {
        int cost = super.getCost();
        return cost + 10;
    }
}
