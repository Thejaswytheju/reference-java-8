package com.theja.chap16.ex.java.com.thread.java;

import java.util.concurrent.Semaphore;

public class Q {
    int n;
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("got:" + n);
        semProd.release();

    }
    void put(int n){
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.n=n;
        System.out.println("put:"+n);
        semCon.release();
    }
}