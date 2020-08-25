package com.example.demo.test.service.impl;

import com.example.demo.test.data.Order;
import com.example.demo.test.service.OrderMessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * @Description:使用JMS实现发送异步消息
 * @Author: lyk
 * @Date: 2020/8/20 21:44
 */
@Service
public class JmsOrderMessagingService implements OrderMessagingService {

    private JmsTemplate jmsTemplate;

    @Autowired
    public JmsOrderMessagingService(JmsTemplate jmsTemplate){
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendOrder(Order order) {
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                //被传送的对象必须实现序列化接口
                return session.createObjectMessage(order);
            }
        });
    }
}
