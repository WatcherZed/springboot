package com.example.demo.test.client;
/**
 * @ Description   :  webService协议客户端
 * @ Author        :  lyk
 * @ CreateDate    :  2020/8/22 16:36
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/8/22 16:36
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class JwsServiceClient {


    public static void main(String[] args) {
        JwsServiceHello hello = new JwsServiceHelloService().getJwsServiceHelloPort();
        int num = hello.getNum(12, 11);
        String s = hello.getValue("刘永康");
        System.out.println(num);
        System.out.println(s);
    }
}
