package com.example.demo.design.builderPattern;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/6 17:00
 */
public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("A2");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B2");
    }

    @Override
    public void buildPartC() {
        product.setPartC("C2");
    }
}
