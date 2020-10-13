package com.example.demo.design.bridgePattern;

public abstract class Abstraction {
    //定义实现类的接口对象
    protected Implementor impl;
    public void setImpl(Implementor impl){
        this.impl = impl;
    }
    //声明抽象业务方法
    public abstract void operation();
}
