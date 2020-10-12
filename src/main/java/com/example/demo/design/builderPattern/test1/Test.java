package com.example.demo.design.builderPattern.test1;

public class Test {
    public static void main(String[] args) {
        Director director = new Director(new ServerBuilder());
        ComputerBuilder construct = director.construct();
        Computer result = construct.getResult();
        System.out.println(result.toString());

    }
}
