package com.example.demo.design.builderPattern;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/6 16:59
 */
public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("A1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B1");
    }

    @Override
    public void buildPartC() {
        product.setPartC("C1");
    }
}
