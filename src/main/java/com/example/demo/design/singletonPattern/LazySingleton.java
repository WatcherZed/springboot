package com.example.demo.design.singletonPattern;

/**
 * @ Description   :  懒汉式单例类 此方法存在线程安全问题,解决方法如下
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/13 14:01
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/13 14:01
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class LazySingleton {
    //需要注意 如果使用双重检查锁定来实现懒汉式加载,需要添加修饰符volatile，被修饰的成员变量可以确保多个线程可以正确处理，
    private volatile static LazySingleton instance = null;

    private LazySingleton() {

    }

    //解决方法为在方法上加锁，然而 加锁会影响效率，在多线程高并发的访问环境中，会导致系统的性能大大降低
//    synchronized public static LazySingleton getInstance(){
//        if (instance == null){
//            instance = new LazySingleton();
//        }
//        return instance;
//    }
    //改进后的方法，仅对代码加锁,然而此方法并不能保证单例对象的唯一性,因此需要对单例对象进行二次判断
    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null)
                    //创建单例实例对象
                    instance = new LazySingleton();
            }
        }
        return instance;
    }
}
