package com.example.demo.design.singletonPattern;

/**
 * @ Description   :  测试单例类的唯一性
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/13 13:58
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/13 13:58
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
