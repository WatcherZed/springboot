package com.example.demo.test.service;

import com.example.demo.test.data.Order;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/8/20 21:44
 */
public interface OrderMessagingService {
    void sendOrder(Order order);
}
