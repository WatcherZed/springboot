package com.example.demo.design.flyweight;

import java.util.HashMap;

/**
 * @Description:享元工厂类
 * @Author: lyk
 * @Date: 2020/10/29 19:31
 */
public class FlyweightFactory {
    //定义一个HashMap用于存储享元对象，实现享元池
    private HashMap flyweights = new HashMap();
    public Flyweight getFlyweight(String key){
        //如果对象存在，则直接从享元池获取
        if (flyweights.containsKey(key)){
            return (Flyweight) flyweights.get(key);
        }
        //如果对象不存在，先创建一个新的对象添加到享元对象中，然后返回
        else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key,flyweight);
            return flyweight;
        }
    }
}
