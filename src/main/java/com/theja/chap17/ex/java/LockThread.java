package com.theja.chap17.ex.java;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable{
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
        new Thread(this).start();
    }

    public void run() {

        System.out.println("Starting " + name);

        try {
            // First, lock count.
            System.out.println(name + " is waiting to lock count.");
            lock.lock();
            System.out.println(name + " is locking count.");

            Shared1.count++;
            System.out.println(name + ": " + Shared1.count);

            // Now, allow a context switch -- if possible.
            System.out.println(name + " is sleeping.");
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {
            // Unlock
            System.out.println(name + " is unlocking count.");
            lock.unlock();
        }
    }

}
