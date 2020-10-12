package com.example.demo.design.builderPattern.test1;

public abstract class ComputerBuilder {
    protected Computer computer = new Computer();


    public abstract void builderCPU();

    public abstract void builderRAM();

    public abstract void builderHardDisk();

    public abstract void builderHost();

    public Computer getResult(){
        return computer;
    }
}
