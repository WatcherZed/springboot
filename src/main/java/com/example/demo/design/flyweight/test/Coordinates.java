package com.example.demo.design.flyweight.test;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/29 19:58
 */
public class Coordinates {
    private int x;
    private int y;

    public Coordinates() {
        this(0, 0);
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
