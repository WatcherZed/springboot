package com.example.demo.design.builderPattern.test1;

/**
 * @ Description   :  指挥者类,负责创建出电脑类
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/12 16:36
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/12 16:36
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class Director {
    private ComputerBuilder builder;
    public Director(ComputerBuilder builder){
        this.builder = builder;
    }
    public ComputerBuilder construct(){
        builder.builderCPU();
        builder.builderRAM();
        builder.builderHardDisk();
        builder.builderHost();
        return builder;
    }
}
