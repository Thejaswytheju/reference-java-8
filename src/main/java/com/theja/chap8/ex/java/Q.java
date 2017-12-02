package com.theja.chap8.ex.java;

public class Q {
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while (!valueSet)
        try {
                wait();
        }catch (InterruptedException e){
            System.out.println("Interrupted exception found");
        }
        System.out.println("got:" +n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while (valueSet)
            try {
            wait();
            }catch (InterruptedException e){
            System.out.println("Interrupted exception");
            }
            this.n =n;
            System.out.println("put:" +n);
            valueSet = true;
            notify();

    }
}
