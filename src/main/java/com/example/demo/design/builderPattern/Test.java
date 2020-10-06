package com.example.demo.design.builderPattern;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/6 17:02
 */
public class Test {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder2();
        Director director = new Director(builder);
        Product construct = director.construct();
        System.out.println(construct.getPartA());
        System.out.println(construct.getPartB());
        System.out.println(construct.getPartC());
    }

}
