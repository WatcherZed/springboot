package com.example.demo.design.facadepattern;

/**
 * @Description:
 * @Author: lyk
 * @Date: 2020/10/28 23:01
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("src/main/java/com/example/demo/design/facadepattern/src.txt",
                "src/main/java/com/example/demo/design/facadepattern/des.txt"
                );
    }
}
