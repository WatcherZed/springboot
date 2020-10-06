package com.example.demo.design.abstractFactory;
/**
 * @ Description   :  抽象工厂
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/28 19:27
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/28 19:27
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
