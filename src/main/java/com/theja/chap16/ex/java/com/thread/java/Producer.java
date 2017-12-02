package com.theja.chap16.ex.java.com.thread.java;

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for(int i=0; i < 5; i++) q.put(i);
    }
}


