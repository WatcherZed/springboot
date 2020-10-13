package com.example.demo.design.singletonPattern.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Description   :  连接池对象
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/13 14:21
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/13 14:21
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class ConnectionPool {
    private static List pool = null;

    private ConnectionPool() {

    }

    private static class HoderClass {
        private final static ConnectionPool instance = new ConnectionPool();
    }

    public static ConnectionPool getInstance(int num) {
        pool = new ArrayList();
        for (int i = 0; i < num; i++) {
            pool.add(new Connection());
        }
        return HoderClass.instance;
    }

    public static List getPool() {
        return pool;
    }
}
