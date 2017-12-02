package com.theja.chap7.ex.java;

public class CallMe {
    public void Call() {
    }
    public void Call(String msg){
        System.out.println("[" +msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }


}
