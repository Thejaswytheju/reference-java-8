package com.theja.chap10.ex.java;

public class NonGenTest {
    public static void main(String args[]){
        NonGen<String> w = new NonGen<String>("Hello",47);
        System.out.print(w);
        System.out.println(w.getNum());

    }
}
