package com.theja.chap8.ex.java;

public class Producer implements Runnable {
    Q q;
    Producer(Q q){
        this.q = q;
        new Thread(this,"Producer").start();
    }
    public void run() {
        for(int i =0;i<3;i++)
        while (true){
            q.put(i);
        }

    }
}
