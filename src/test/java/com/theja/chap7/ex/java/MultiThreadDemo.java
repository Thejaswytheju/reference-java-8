package com.theja.chap7.ex.java;

public class MultiThreadDemo {
    public static void main(String args[]){
        new NewThread("one");
        new NewThread("two");
        new NewThread("three");

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("main thread interrupted:");
        }
        System.out.println("Main thread executing");

    }
}
