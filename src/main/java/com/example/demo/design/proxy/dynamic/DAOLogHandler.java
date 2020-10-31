package com.example.demo.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Description:自定义请求处理程序类(实现动态代理)
 * @Author: lyk
 * @Date: 2020/10/30 19:42
 */
public class DAOLogHandler implements InvocationHandler {
    private Calendar calendar;
    private Object object;

    public DAOLogHandler() {

    }

    public DAOLogHandler(Object object) {
        this.object = object;
    }

    //实现invoke方法，调用在真实主题类中定义的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object,args);
        afterInvoke();
        return result;
    }

    //记录方法调用时间
    public void beforeInvoke() {
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + " : " + minute + " : " + second;
        System.out.println(time);
    }

    public void afterInvoke() {
        System.out.println("方法调用结束:");
    }
}
