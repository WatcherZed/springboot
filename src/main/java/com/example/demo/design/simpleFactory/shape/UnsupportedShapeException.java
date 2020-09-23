package com.example.demo.design.simpleFactory.shape;
/**
 * @ Description   :  不支持绘制异常
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/23 19:27
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/23 19:27
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class UnsupportedShapeException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("该图形不支持绘制");
    }
}
