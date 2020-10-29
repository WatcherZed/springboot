package com.example.demo.design.flyweight.test;

/**
 * @Description:黑色棋子类，充当具体享元类
 * @Author: lyk
 * @Date: 2020/10/29 19:45
 */
public class BlackIgoChessman extends IgoChessman{
    @Override
    public String getColor() {
        return "黑色";
    }
}
