package com.example.demo.design.simpleFactory.shape;
/**
 * @ Description   :  几何图形类接口
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/23 19:24
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/23 19:24
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface Shape {

    void draw() throws UnsupportedShapeException;

    void erase();
}
