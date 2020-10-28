package com.example.demo.design.decoratorpattern.test2;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:48
 */
public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "重烘焙咖啡";
    }

    @Override
    public int getCost() {
        return 20;
    }
}
