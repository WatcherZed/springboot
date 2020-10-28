package com.example.demo.design.facadepattern;

/**
 * @Description:加密外观类,充当外观类
 * @Author: lyk
 * @Date: 2020/10/28 22:56
 */
public class EncryptFacade {
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;
    public EncryptFacade(){
        fileReader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }
    public void fileEncrypt(String fileNameSrc,String fileNameDes){
        String plainStr = fileReader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        fileWriter.write(encryptStr,fileNameDes);
    }
}
