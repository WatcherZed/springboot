package com.example.demo.design.proxy;

/**
 * @Description:日志记录类
 * @Author: lyk
 * @Date: 2020/10/30 19:23
 */
public class Logger {
    public void log(String userId){
        System.out.println("更新数据库,用户"+userId+"查询次数加1");
    }
}
