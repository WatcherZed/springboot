package com.example.demo.test.data;


import lombok.Data;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/8/12 22:30
 */
@Data
public class Order {

    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
