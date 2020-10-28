package com.example.demo.design.facadepattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description:文件读取类，充当子系统类
 * @Author: lyk
 * @Date: 2020/10/28 21:00
 */
public class FileReader {
    public String read(String fileNameSrc){
        System.out.println("读取文件，获取明文:");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream stream = new FileInputStream(fileNameSrc);
            int data;
            while ((data = stream.read())!=-1){
                sb = sb.append((char) data);
            }
            stream.close();
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在!");
        } catch (IOException e) {
            System.out.println("文件操作错误!");
        }
        return sb.toString();
    }
}
