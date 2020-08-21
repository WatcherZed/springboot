package com.example.demo;

import com.example.demo.test.data.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsTest {
    @Autowired
    private JmsTemplate jmsTemplate;



    public void jmsTemplteTest(Order order){
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(order);
            }
        });
    }
    @Test
    public void sendMessage(){
        Order order = new Order();
        order.setName("刘永康");
        order.setCity("济南");
        jmsTemplteTest(order);
    }

    @Test
    public void receiveOrder(){
        Object o = jmsTemplate.receiveAndConvert("tacocloud.order.queue");
        System.out.println(o);
    }
}
