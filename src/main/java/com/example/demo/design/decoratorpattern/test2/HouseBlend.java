package com.example.demo.design.decoratorpattern.test2;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:47
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "混合咖啡";
    }

    @Override
    public int getCost() {
        return 30;
    }
}
