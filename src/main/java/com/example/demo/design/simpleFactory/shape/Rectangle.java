package com.example.demo.design.simpleFactory.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() throws UnsupportedShapeException {
        System.out.println("绘制了图形");
    }

    @Override
    public void erase() {
        try {
            throw new UnsupportedShapeException();
        } catch (UnsupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
