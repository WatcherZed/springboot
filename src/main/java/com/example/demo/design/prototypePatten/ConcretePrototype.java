package com.example.demo.design.prototypePatten;

public class ConcretePrototype extends Prototype {
    private Prototype prototype;
    private String attr;
    private int num;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype();
        ((ConcretePrototype) prototype).setAttr(this.attr);
        ((ConcretePrototype) prototype).setNum(this.num);
        ((ConcretePrototype) prototype).setPrototype(this.prototype);
        return prototype;
    }

}
