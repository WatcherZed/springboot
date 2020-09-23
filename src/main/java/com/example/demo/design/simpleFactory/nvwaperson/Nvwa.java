package com.example.demo.design.simpleFactory.nvwaperson;

/**
 * @ Description   :  工厂类
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/23 16:17
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/23 16:17
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface Nvwa {

    static Person getPerson(String name) {
        Person person ;
        if ("women".equals(name)) {
            person = new Women();
            return person;
        }else if ("man".equals(name)){
            person = new Man();
            return person;
        }else if ("robot".equals(name)){
            person = new Robot();
            return person;
        }
        return null;
    }
}
