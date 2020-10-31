package com.example.demo.design.iterator.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/31 14:16
 */
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<Object>();
    public AbstractObjectList(List<Object> objects){
        this.objects = objects;
    }
    public void addObject(Object obj){
        this.objects.add(obj);
    }
    public void removeObject(Object obj){
        this.objects.remove(obj);
    }
    public List<Object> getObjects(){
        return this.objects;
    }
    public abstract AbstractIterator createIterator();
}
