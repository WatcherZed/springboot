package com.example.demo.design.decoratorpattern;

/**
 * @Description:抽象装饰类
 * @Author: lyk
 * @Date: 2020/10/27 20:46
 */
public class Decorator extends Component{

    //维持一个对抽象构件对象的引用
    private Component component;

    //注入一个抽象构件类型的对象
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operation() {
        //调用原有的业务方法
        component.operation();
    }
}
