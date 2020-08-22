package com.example.demo.test.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
/**
 * @ Description   :  web Service协议服务端
 * @ Author        :  lyk
 * @ CreateDate    :  2020/8/22 16:36
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/8/22 16:36
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@WebService
public class JwsServiceHello {

    /*
    供客户端调用的方法，该方法是非静态的，会被发布
     */
    public String getValue(String name) {
        name = name + "方法调用测试";
        return name;
    }

    public int getNum(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/WebServiceTest", new JwsServiceHello());
        System.out.println("发布成功");
    }
}
