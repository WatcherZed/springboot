package com.example.demo.design.simpleFactory;

import com.example.demo.design.simpleFactory.impl.Apple;
import com.example.demo.design.simpleFactory.impl.Banana;

/**
 * @ Description   :  ����һ��ˮ���������ͻ�����ˮ�����ƣ����ؿͻ���Ҫ��ˮ����������ˮ���Ĺ��з����͸��Կ���ʹ�õķ���
 *      �򵥹������������ö�̬���ͻ���ֻҪ֪������������ƣ����ɴ��������࣬���з��������ٴ�ʵ�֣�����רע�ھ�����˽�з�����ʵ��
 *              ����ÿ����һ�������࣬����������Ҫ�޸Ĵ��룬�����Ͽ���ԭ��
 * @ Author        :  lyk
 * @ CreateDate    :  2020/9/22 11:08
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/9/22 11:08
 * @ UpdateRemark  :  �޸�����
 * @ Version       :  1.0
 */
public interface SimpleFactory {

    static Fruit getFruit(String fruit){
        Fruit fruit1 = null;
        if ("apple".equals(fruit)){
            fruit1 = new Apple();
            fruit1.publicMethod();
            fruit1.privateMethod();
        }else if ("banana".equals(fruit)){
            fruit1 = new Banana();
        }
        return fruit1;
    }
}
