package com.example.demo.design.simpleFactory.shape;

public class Triangle implements Shape {
    @Override
    public void draw() throws UnsupportedShapeException {
        System.out.println("绘制了图形");
    }

    @Override
    public void erase() {
        System.out.println("擦除了图形");
    }
}
