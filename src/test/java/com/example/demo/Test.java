package com.example.demo;


import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class Test {

    private static SpringbootApplicationTests springbootApplicationTests = new SpringbootApplicationTests();

    @org.junit.Test
    public void test(){
        System.out.println(springbootApplicationTests.toString());
    }
}
