package com.theja.chap16.ex.java.com.thread.java;

public class ProdCon {
    public static void main(String args[]) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
