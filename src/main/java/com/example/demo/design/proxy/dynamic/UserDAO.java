package com.example.demo.design.proxy.dynamic;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/30 19:38
 */
public class UserDAO implements AbstractUserDAO{
    @Override
    public Boolean findUserById(String userId) {
        if ("张无忌".equalsIgnoreCase(userId)){
            System.out.println("查询ID为"+userId+"的用户信息成功");
            return true;
        }else {
            System.out.println("查询ID为"+userId+"的用户信息失败");
            return false;
        }
    }

    @Override
    public String print(String name) {
        System.out.println(name);
        return name;
    }
}
