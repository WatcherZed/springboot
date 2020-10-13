package com.example.demo.design.singletonPattern.test;

/**
 * @ Description   :  连接池对象
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/13 14:23
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/13 14:23
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class Connection {
    private boolean isUse = false;
    public Connection(){

    }

    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        isUse = use;
    }
}
