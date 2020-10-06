package com.example.demo.design.simpleFactory.shape;
/**
 * @ Description   :  简单工厂类,在此处返回具体工厂类
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/23 19:34
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/23 19:34
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface SimpleFactory {

    static Shape getShape(String name){
        if ("rectangle".equals(name)){
            return new Rectangle();
        }else if ("Triangle".equals(name)){
            return new Triangle();
        }else if ("circle".equals(name)){
            return new Circle();
        }
        return null;
    }
}
