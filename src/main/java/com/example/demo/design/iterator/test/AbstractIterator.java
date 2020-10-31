package com.example.demo.design.iterator.test;

/**
 * @Description:抽象迭代器
 * @Author: lyk
 * @Date: 2020/10/31 14:20
 */
public interface AbstractIterator {
    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();
}
