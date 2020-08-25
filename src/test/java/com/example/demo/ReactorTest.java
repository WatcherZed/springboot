package com.example.demo;

import com.example.demo.test.data.Order;
import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java反应式编程
 * @Author: lyk
 * @Date: 2020/8/25 21:05
 */
public class ReactorTest {
    @Test
    public void createAFlux_just() {
        //如果有一个或者多个对象可以用静态方法just()来创建一个反应式类型,它们的数据会由这些对象来驱动
        Flux<String> fruitFlux = Flux.just("Apple", "Orange", "Grape", "Banana", "Strawberry");

        fruitFlux.subscribe(f -> System.out.println(f));

        StepVerifier.create(fruitFlux)
                .expectNext("Apple")
                .expectNext("Orange")
                .expectNext("Grape")
                .expectNext("Banana")
                .expectNext("Strawberry")
                .verifyComplete();
    }

    //使用数组创建反应式编程
    @Test
    public void createAFlux_fromArray() {
        String[] fruits = new String[]{
                "Apple", "Orange", "Grape", "Banana", "Strawberry"};
        Flux<String> flux = Flux.fromArray(fruits);

        flux.subscribe(f -> System.out.println(f));

    }

    //使用迭代器创建反应式编程
    @Test
    public void createAFlux_fromIterable() {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Grape");
        fruitList.add("Banana");
        fruitList.add("Strawberry");

        Flux<String> fruitFlux = Flux.fromIterable(fruitList);

        fruitFlux.subscribe(f -> System.out.println(f));
    }

    //计数器
    @Test
    public void createAFlux_range(){
        Flux<Integer> integerFlux = Flux.range(1,10);
        integerFlux.subscribe(System.out::println);
    }

    @Test
    public void createAFlux_interval(){
        Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(1)).take(5);

        intervalFlux.subscribe(System.out::println);
    }

    //合并两个Flux的数据
    @Test
    public void mergeFluxes(){
        Flux<String> characterFlux = Flux
                .just("Garfield","Kojak","Barbossa");
        Flux<String> foodFlux = Flux
                .just("Lasagna","Lollipops","Apples");
        //创建一个新的容器
        Flux<String> mergedFlux = foodFlux.mergeWith(characterFlux);

        mergedFlux.subscribe(System.out::println);
    }
}
