package com.theja.chap7.ex.java;



public class Synch {
    public static void main(String args[]){
       CallMe target = new CallMe();
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target,"Synchronized");
        Caller ob3 = new Caller(target,"world");
        ob1.t.run();
        ob2.t.run();
        ob3.t.run();
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

}
