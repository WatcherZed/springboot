package com.example.demo.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/30 19:48
 */
public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = null;
        AbstractUserDAO userDAO = new UserDAO();
        handler = new DAOLogHandler(userDAO);
        Object proxy = null;

        //动态创建代理对象，用于代理一个AbstractUserDAO类型的真实主题对象
        proxy = Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(),new Class[]{AbstractUserDAO.class,AbstractDocumentDAO.class},handler);
//        AbstractUserDAO userDAO1 = (AbstractUserDAO) proxy;
        AbstractDocumentDAO documentDAO1 = (AbstractDocumentDAO) proxy;
        documentDAO1.deleteDocumentById("D001");
//        userDAO1.print("张无忌");


//        AbstractDocumentDAO documentDAO = new DocumentDAO();
//        handler = new DAOLogHandler(documentDAO);
//        AbstractDocumentDAO proxy_new = null;
//        proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(),new Class[]{AbstractDocumentDAO.class},handler);
//        proxy_new.deleteDocumentById("001");
    }
}
