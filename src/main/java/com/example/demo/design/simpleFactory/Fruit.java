package com.example.demo.design.simpleFactory;
/**
 * @ Description   :  水果类,负责生产出水果的共有方法,设定每个水果单独拥有的抽象方法，让每个水果单独实现
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/22 11:16
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/22 11:16
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public abstract class Fruit {

    /**
     * @Description  :水果类的共有方法
     * @author       : lyk
     * @param        :
     * @return       :
     * @exception    :
     * @date         : 2020/9/22 11:21
     */
    public void publicMethod(){
        System.out.println("水果都可以吃!");
    }

    /**
     * @Description  :每个具体水果的独有方法
     * @author       : lyk
     * @param        :
     * @return       :
     * @exception    :
     * @date         : 2020/9/22 11:22
     */
    public abstract void privateMethod();

    public static void main(String[] args) {
        Fruit banana = SimpleFactory.getFruit("banana");
    }
}
