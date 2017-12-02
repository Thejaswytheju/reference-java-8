package com.theja.chap1.ex.java;


public class BlockTest {
    public static void main(String args[]){
        int x,y;
        x = 0;
        y = 20;
        for (x=0;x<10;x++) {
            System.out.println("x is :" + x);
            System.out.println("y is :" + y);

            y = y - 2;
        }
    }
}
