package com.example.demo.design.builderPattern.test2;

public class Test {
    public static void main(String[] args) {
        Director director = new Director(new FullMode());
        SoftBuilder construct = director.construct();
        Soft soft = construct.resultSoft();
        System.out.println(soft.toString());
    }
}
