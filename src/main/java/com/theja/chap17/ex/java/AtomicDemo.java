package com.theja.chap17.ex.java;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String args[]) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}

class Shared {
    static AtomicInteger ai = new AtomicInteger(0);
}

