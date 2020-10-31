package com.example.demo.design.iterator;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/31 14:10
 */
public class ConcreteAggregate implements Aggregate {
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
