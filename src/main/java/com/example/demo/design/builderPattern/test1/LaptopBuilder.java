package com.example.demo.design.builderPattern.test1;
/**
 * @ Description   :  笔记本类
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/12 16:33
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/12 16:33
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class LaptopBuilder extends ComputerBuilder{

    @Override
    public void builderCPU() {
        super.computer.setCPU("笔记本的CPU");
    }

    @Override
    public void builderRAM() {
        super.computer.setRAM("笔记本的RAM");
    }

    @Override
    public void builderHardDisk() {
        super.computer.setHardDisk("笔记本的HardDisk");
    }

    @Override
    public void builderHost() {
        super.computer.setHost("笔记本的Host");
    }
}
