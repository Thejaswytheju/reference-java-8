package com.theja.chap16.ex.java.com.thread.java;

public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for(int i=0; i < 5; i++)  q.get();
    }
}
