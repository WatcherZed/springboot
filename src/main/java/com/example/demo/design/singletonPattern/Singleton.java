package com.example.demo.design.singletonPattern;

/**
 * @ Description   :  单例模式
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/13 13:57
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/13 13:57
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
