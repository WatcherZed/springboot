package com.example.demo.design.builderPattern;

/**
 * @Description: 抽象建造者
 * @Author: lyk
 * @Date: 2020/10/6 16:53
 */
public abstract class Builder {
    //创建产品对象  单例
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    //返回产品对象
    public Product getResult(){
        return product;
    }
}
