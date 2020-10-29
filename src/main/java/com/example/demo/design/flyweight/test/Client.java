package com.example.demo.design.flyweight.test;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/29 19:52
 */
public class Client {
    public static void main(String[] args) {
        IgoChessman black1,black2,black3,white1,white2,white3;
        IogChessmanFactory factory;
        factory = IogChessmanFactory.getInstance();
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println(black1 == black2);
        black1.display(new Coordinates(2,1));
        black2.display(new Coordinates(3,5));
        black3.display(new Coordinates(6,1));
    }
}
