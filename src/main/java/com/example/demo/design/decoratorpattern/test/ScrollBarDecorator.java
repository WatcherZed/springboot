package com.example.demo.design.decoratorpattern.test;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:00
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }
    public void display(){
        this.setScrollBar();
        super.display();
    }
    public void setScrollBar(){
        System.out.println("为构件添加滚动条");
    }
}
