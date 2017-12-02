package com.theja.chap4.ex.java;


public class ATest {
    public static void main(String args[]){
        A superObj = new A();
        B subObj = new B();

        superObj.i = 10;
        superObj.j =5;
        System.out.println("contents of the superObj:");
        superObj.showij();
        System.out.println();

        subObj.i = 12;
        subObj.j =9;
        subObj.k = 5;
        System.out.println("contents of the subObj:");
        subObj.showij();
        subObj.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb:");
        subObj.Sum();

    }
}
