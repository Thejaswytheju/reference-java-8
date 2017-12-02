package com.theja.chap7.ex.java;

public class CurrentThreadDemo {
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println("current thread:" + t);

        t.setName("MyThread");
        System.out.println("name change:"+t);

        try {
            for (int i =0;i<3;i++)
                System.out.println(i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted:");
        }
    }

}
