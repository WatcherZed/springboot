package com.example.demo.design.decoratorpattern.test2;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:50
 */
public class Cust {
    public static void main(String[] args) {
        Beverage beverage,beverage1,beverage2,beverage3;
        beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        beverage = new Whip(beverage);
        beverage.getCost();
        beverage.getDescription();
        System.out.println(beverage.getDescription()+"  "+"￥"+beverage.getCost());
    }
}
