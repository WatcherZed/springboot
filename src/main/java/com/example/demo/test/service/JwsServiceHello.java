package com.example.demo.test.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
/**
 * @ Description   :  web ServiceЭ������
 * @ Author        :  lyk
 * @ CreateDate    :  2020/8/22 16:36
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/8/22 16:36
 * @ UpdateRemark  :  �޸�����
 * @ Version       :  1.0
 */
@WebService
public class JwsServiceHello {

    /*
    ���ͻ��˵��õķ������÷����ǷǾ�̬�ģ��ᱻ����
     */
    public String getValue(String name) {
        name = name + "�������ò���";
        return name;
    }

    public int getNum(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8080/WebServiceTest", new JwsServiceHello());
        System.out.println("�����ɹ�");
    }
}
