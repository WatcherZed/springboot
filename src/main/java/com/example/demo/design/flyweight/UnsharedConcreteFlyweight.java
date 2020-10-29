package com.example.demo.design.flyweight;

/**
 * @Description:非共享具体享元类
 * @Author: lyk
 * @Date: 2020/10/29 19:30
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(String extrinsicState) {
        //实现业务方法

        System.out.println(extrinsicState);
    }
}
