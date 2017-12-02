package com.theja.chap7.ex.java;

public class Caller implements Runnable {
    CallMe msg;
    String target;
    Thread t;

    public Caller(CallMe s, String targ) {
        msg = s;
        target = targ;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            msg.Call(target);

        }
    }
}
