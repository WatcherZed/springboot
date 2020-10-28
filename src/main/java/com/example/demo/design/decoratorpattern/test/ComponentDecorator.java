package com.example.demo.design.decoratorpattern.test;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/27 20:59
 */
public class ComponentDecorator extends Component {
    private Component component;
    public ComponentDecorator(Component component){
        this.component = component;
    }
    @Override
    public void display() {
        component.display();
    }
}
