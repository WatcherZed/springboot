package com.example.demo.design.proxy.dynamic;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/30 19:40
 */
public class DocumentDAO implements AbstractDocumentDAO {
    @Override
    public Boolean deleteDocumentById(String documentId) {
        if ("D001".equalsIgnoreCase(documentId)){
            System.out.println("删除ID为"+documentId+"的数据成功");
            return true;
        }else {
            System.out.println("删除ID为"+documentId+"的数据失败");
            return false;
        }
    }
}
