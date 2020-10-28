package com.example.demo.design.facadepattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:文件保存类，充当子系统类
 * @Author: lyk
 * @Date: 2020/10/28 22:52
 */
public class FileWriter {
    public void write(String encryptStr,String fileNameDes){
        System.out.println("保存密文,写入文件:");
        try {
            FileOutputStream outputStream = new FileOutputStream(fileNameDes);
            outputStream.write(encryptStr.getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件操作错误");
        }
    }
}
