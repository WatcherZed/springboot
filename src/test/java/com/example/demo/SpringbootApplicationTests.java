package com.example.demo;

import com.example.demo.test.data.Order;
import com.example.demo.test.service.OrderMessagingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class SpringbootApplicationTests {
    @Autowired
    OrderMessagingService orderMessagingService;

    @Test
    public void testJms(){
        orderMessagingService.sendOrder(new Order());
    }



//    @Bean
//    People printPeople(){
//        People people = new People();
//        people.setAge(21);
//        people.setName("刘永康");
//        return people;
//    }



}


