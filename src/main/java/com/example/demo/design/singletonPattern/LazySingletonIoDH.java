package com.example.demo.design.singletonPattern;

/**
 * @ Description   :  通过静态内部类实现懒汉加载单例模式
 *          此方法无需线程锁定
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/13 14:11
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/13 14:11
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class LazySingletonIoDH {
    private LazySingletonIoDH(){

    }
    //静态内部类
    private static class HolderClass{
        private final static LazySingletonIoDH instance = new LazySingletonIoDH();
    }
    private static LazySingletonIoDH getInstance(){
        return HolderClass.instance;
    }
}
