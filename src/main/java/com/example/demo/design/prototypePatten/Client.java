package com.example.demo.design.prototypePatten;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr("Sunny");
        concretePrototype.setNum(100);
        concretePrototype.setPrototype(new ConcretePrototype());
        ConcretePrototype copy = (ConcretePrototype) concretePrototype.clone();
        System.out.println(concretePrototype.getAttr());
        System.out.println(concretePrototype.getNum());
        System.out.println(concretePrototype.getPrototype());
        System.out.println(copy.getAttr());
        System.out.println(copy.getNum());
        System.out.println(copy.getPrototype());
    }
}
