package com.example.demo.design.proxy.dynamic;

/**
 * @Description:抽象用户类
 * @Author: lyk
 * @Date: 2020/10/30 19:36
 */
public interface AbstractUserDAO {
    Boolean findUserById(String userId);
    String print(String name);
}
