package com.example.demo.design.simpleFactory.nvwaperson;

public class NvwaTest {
    public static void main(String[] args) {
        Person women = Nvwa.getPerson("women");
        women.getPerson();
        Person man = Nvwa.getPerson("man");
        man.getPerson();
        Person robot = Nvwa.getPerson("robot");
        robot.getPerson();
        System.out.println(women.equals(man));
    }
}
