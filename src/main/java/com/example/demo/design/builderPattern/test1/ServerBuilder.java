package com.example.demo.design.builderPattern.test1;

/**
 * @ Description   :  服务器
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/12 16:46
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/12 16:46
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class ServerBuilder extends ComputerBuilder{
    @Override
    public void builderCPU() {
        super.computer.setCPU("服务器的CPU");
    }

    @Override
    public void builderRAM() {
        super.computer.setRAM("服务器的RAM");
    }

    @Override
    public void builderHardDisk() {
        super.computer.setHardDisk("服务器的HardDisk");
    }

    @Override
    public void builderHost() {
        super.computer.setHost("服务器的Host");
    }
}
