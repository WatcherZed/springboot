package com.example.demo.design.iterator.test;


import java.util.List;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/31 14:22
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> products) {
        super(products);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
