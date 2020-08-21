package com.example.demo;

import java.util.Arrays;
import java.util.List;


public class LamdaTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","c","python");
        list.forEach(System.out::println);
    }
}
