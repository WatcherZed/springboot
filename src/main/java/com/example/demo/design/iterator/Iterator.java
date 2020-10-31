package com.example.demo.design.iterator;

/**
 * @Description:抽象迭代器
 * @Author: lyk
 * @Date: 2020/10/31 14:06
 */
public interface Iterator {
    void first();//将游标指向第一个元素

    void next();//将游标指向下一个元素

    boolean hasNext();//判断是否存在下一个元素

    Object currentItem();//获取游标指向的当前元素

}
