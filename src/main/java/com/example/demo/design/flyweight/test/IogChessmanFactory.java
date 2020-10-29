package com.example.demo.design.flyweight.test;

import java.util.Hashtable;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/29 19:46
 */
public class IogChessmanFactory {
    private static IogChessmanFactory instance = new IogChessmanFactory();
    private static Hashtable hashtable;
    private IogChessmanFactory(){
        hashtable = new Hashtable();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        hashtable.put("b",black);
        white = new WhiteIgoChessman();
        hashtable.put("w",white);
    }
    public static IogChessmanFactory getInstance(){
        return instance;
    }
    public IgoChessman getIgoChessman(String color){
        return (IgoChessman) hashtable.get(color);
    }
}
