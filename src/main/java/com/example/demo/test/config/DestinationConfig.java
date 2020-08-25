package com.example.demo.test.config;

import org.apache.activemq.artemis.jms.client.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Destination;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/8/20 21:50
 */
@Configuration
public class DestinationConfig {
    @Bean
    public Destination orderQueue(){
        return new ActiveMQQueue("tacocloud.order.queue");
    }
}
