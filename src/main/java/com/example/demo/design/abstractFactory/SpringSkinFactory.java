package com.example.demo.design.abstractFactory;

/**
 * @ Description   :  具体工厂类
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/28 19:29
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/28 19:29
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class SpringSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
