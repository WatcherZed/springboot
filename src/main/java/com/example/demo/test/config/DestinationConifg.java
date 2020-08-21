package com.example.demo.test.config;

import org.apache.activemq.artemis.jms.client.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Destination;

@Configuration
public class DestinationConifg {

    @Bean
    public Destination defaultDestination(){
        return new ActiveMQQueue("tacocloud.order.queue");
    }
}
