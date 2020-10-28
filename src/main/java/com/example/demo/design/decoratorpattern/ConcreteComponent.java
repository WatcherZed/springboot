package com.example.demo.design.decoratorpattern;

/**
 * @Description:具体构件类
 * 通常在具体构件类中只提供基本功能的实现，复杂功能通过装饰类进行扩展
 * @Author: lyk
 * @Date: 2020/10/27 20:44
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("基本功能的实现");
    }
}
