package com.example.demo.design.decoratorpattern;

/**
 * @Description: 具体装饰类
 * 在具体装饰类中可以调用抽象装饰类的operation方法，也可以定义新的业务方法，如果不希望该方法被客户端单独调用，可以将其可见性设置为私有
 * @Author: lyk
 * @Date: 2020/10/27 20:49
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation(){
        super.operation();
        addedBehavior();
    }
    //新增的业务方法
    public void addedBehavior(){
        System.out.println("新增的业务方法");
    }
}
