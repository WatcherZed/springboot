package com.example.demo.design.flyweight.test;

/**
 * @Description:围棋棋子类(充当抽象享元类)
 * @Author: lyk
 * @Date: 2020/10/29 19:44
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色:" + this.getColor() + ",棋子位置:" + coordinates.getX() + "," + coordinates.getY());
    }
}
