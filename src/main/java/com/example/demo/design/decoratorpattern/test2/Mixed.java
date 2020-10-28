package com.example.demo.design.decoratorpattern.test2;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:42
 */
public class Mixed extends Beverage {
    Beverage beverage;
    public Mixed(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public int getCost() {
        return beverage.getCost();
    }
}
