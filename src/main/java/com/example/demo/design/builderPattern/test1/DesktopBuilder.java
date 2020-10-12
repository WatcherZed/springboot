package com.example.demo.design.builderPattern.test1;

/**
 * @ Description   :  台式机
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/12 16:44
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/12 16:44
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class DesktopBuilder extends ComputerBuilder{
    @Override
    public void builderCPU() {
        super.computer.setCPU("台式机的CPU");
    }

    @Override
    public void builderRAM() {
        super.computer.setRAM("台式机的RAM");
    }

    @Override
    public void builderHardDisk() {
        super.computer.setHardDisk("台式机的HardDisk");
    }

    @Override
    public void builderHost() {
        super.computer.setHost("台式机的Host");
    }
}
