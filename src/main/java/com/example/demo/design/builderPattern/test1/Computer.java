package com.example.demo.design.builderPattern.test1;

/**
 * @ Description   :  电脑类
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/12 16:30
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/12 16:30
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class Computer {

    private String CPU;
    //内存
    private String RAM;
    //硬盘
    private String hardDisk;
    //主机
    private String host;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", host='" + host + '\'' +
                '}';
    }
}
