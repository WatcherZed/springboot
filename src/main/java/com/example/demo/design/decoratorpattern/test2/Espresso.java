package com.example.demo.design.decoratorpattern.test2;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:41
 */
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    @Override
    public int getCost() {
        return 25;
    }
}
