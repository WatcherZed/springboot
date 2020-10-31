package com.example.demo.design.proxy;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/30 19:31
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        searcher.doSearch("AA","九阴白骨掌");
    }
}
