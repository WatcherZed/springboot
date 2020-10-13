package com.example.demo.design.singletonPattern.test;

public class Client {
    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPool.getInstance(5);
        System.out.println(ConnectionPool.getPool().size());
    }
}
