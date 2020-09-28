package com.example.demo.design.abstractFactory;

public class Test {
    public static void main(String[] args) {
        SkinFactory skinFactory = XMLUtil.getBean();
        Button button = skinFactory.createButton();
        TextField textField = skinFactory.createTextField();
        ComboBox comboBox = skinFactory.createComboBox();
        button.display();
        comboBox.display();
        textField.display();
    }
}
