package com.example.demo.design.proxy;

/**
 * @Description:身份验证类
 * @Author: lyk
 * @Date: 2020/10/30 19:20
 */
public class AccessValidator {
    public boolean validate(String userId){
        System.out.println("在数据库中验证用户"+userId+"是否为合法用户");
        if (userId.equalsIgnoreCase("aa")){
            System.out.println(userId+"登录成功");
            return true;
        }else {
            System.out.println(userId+"登录失败");
            return false;
        }
    }
}
