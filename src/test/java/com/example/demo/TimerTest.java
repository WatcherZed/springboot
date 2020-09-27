package com.example.demo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {


    public static void main(String[] args) {
        new Timer("testTimer").schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("TimerTask" + new Date());
            }
        }, 0,5000);
    }
}
