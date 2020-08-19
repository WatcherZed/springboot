package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SpringbootApplicationTests {

    private People people;

    @Autowired
    public SpringbootApplicationTests(People people){
        this.people = people;
        System.out.println(people);
    }



//    @Bean
//    People printPeople(){
//        People people = new People();
//        people.setAge(21);
//        people.setName("刘永康");
//        return people;
//    }

    void whatPeople(){
        System.out.println(people);
    }

    public static void main(String[] args) {
        SpringbootApplicationTests springbootApplicationTests = new SpringbootApplicationTests(new People());
        springbootApplicationTests.whatPeople();
    }


}

@Component
class People {
    private String name;
    private int age;

    public People(){
        this.name = "刘永康";
        this.age = 21;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
