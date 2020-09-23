package com.example.demo.design.simpleFactory.shape;

public class ShapeTest {
    public static void main(String[] args) {
        try{

            Shape circle = SimpleFactory.getShape("rectangle");
            circle.draw();
            circle.erase();
        }catch (NullPointerException e){
            System.out.println("没有该图形");
        } catch (UnsupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
