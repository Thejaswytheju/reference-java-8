package com.theja.chap16.ex.java.com.thread3.java;

import com.theja.chap16.ex.java.com.thread2.java.MyThread;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String args[]) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction() );

        System.out.println("Starting");

        new MyThread1(cb, "A");
        new MyThread1(cb, "B");
        new MyThread1(cb, "C");
        new MyThread1(cb, "X");
        new MyThread1(cb, "Y");
        new MyThread1(cb, "Z");
    }
}
