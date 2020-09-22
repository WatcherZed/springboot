package com.example.demo.design.simpleFactory;
/**
 * @ Description   :  ˮ����,����������ˮ���Ĺ��з���,�趨ÿ��ˮ������ӵ�еĳ��󷽷�����ÿ��ˮ������ʵ��
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/22 11:16
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/22 11:16
 * @ UpdateRemark  :  �޸�����
 * @ Version       :  1.0
 */
public abstract class Fruit {

    /**
     * @Description  :ˮ����Ĺ��з���
     * @author       : lyk
     * @param        :
     * @return       :
     * @exception    :
     * @date         : 2020/9/22 11:21
     */
    public void publicMethod(){
        System.out.println("ˮ�������Գ�!");
    }

    /**
     * @Description  :ÿ������ˮ���Ķ��з���
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
