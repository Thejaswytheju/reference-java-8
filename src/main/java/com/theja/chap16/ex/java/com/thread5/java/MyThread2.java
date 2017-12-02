package com.theja.chap16.ex.java.com.thread5.java;

import java.util.concurrent.CountDownLatch;

public class MyThread2 implements Runnable {
    String name;
    CountDownLatch latch;

    MyThread2(CountDownLatch c, String n) {
        latch = c;
        name = n;

        new Thread(this);
    }

    public void run() {

        for(int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
