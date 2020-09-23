package com.example.demo.design.simpleFactory;

import com.example.demo.design.simpleFactory.impl.Apple;
import com.example.demo.design.simpleFactory.impl.Banana;

/**
 * @ Description   :  创建一个水果工厂，客户输入水果名称，返回客户需要的水果，并返回水果的共有方法和各自可以使用的方法
 *      简单工厂方法：利用多态，客户端只要知道具体类的名称，即可创建具体类，公有方法无需再次实现，可以专注于具体类私有方法的实现
 *              但是每增加一个具体类，工厂方法需要修改代码，不符合开闭原则
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/22 11:08
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/22 11:08
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface SimpleFactory {

    static Fruit getFruit(String fruit){
        Fruit fruit1 = null;
        if ("apple".equals(fruit)){
            fruit1 = new Apple();
            fruit1.publicMethod();
            fruit1.privateMethod();
        }else if ("banana".equals(fruit)){
            fruit1 = new Banana();
        }
        return fruit1;
    }
}
