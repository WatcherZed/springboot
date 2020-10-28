package com.example.demo.design.decoratorpattern.test;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 21:02
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }
    public void display(){
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("增加黑色滚动边框");
    }
}
