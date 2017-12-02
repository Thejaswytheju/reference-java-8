package com.theja.chap17.ex.java;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String args[]) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A");
        new LockThread(lock, "B");

    }
}

// A shared resource.
class Shared1 {
    static int count = 0;
}

