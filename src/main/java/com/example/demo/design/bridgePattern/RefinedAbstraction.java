package com.example.demo.design.bridgePattern;

public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        //业务代码
        impl.operationImpl();
        //业务代码
    }
}
