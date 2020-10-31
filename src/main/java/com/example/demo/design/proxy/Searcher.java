package com.example.demo.design.proxy;

/**
 * @Description:抽象查询类
 * @Author: lyk
 * @Date: 2020/10/30 19:24
 */
public interface Searcher {
    String doSearch(String userId,String keyword);
}
