package com.example.demo.design.simpleFactory.shape;
/**
 * @ Description   :  圆形
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/23 19:26
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/23 19:26
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class Circle implements Shape{
    @Override
    public void draw() throws UnsupportedShapeException {
        throw new UnsupportedShapeException();
    }

    @Override
    public void erase() {
        System.out.println("擦除了图形");
    }
}
