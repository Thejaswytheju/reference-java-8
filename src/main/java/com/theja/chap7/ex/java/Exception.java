package com.theja.chap7.ex.java;

public class Exception {
    public static void main(String args[]){
        int a,b;
        try {
            a=0;
            b= 40/a;
            System.out.println("never executed");
        }
        catch (ArithmeticException e){
            System.out.println("divide by zero:");
        }
        System.out.println("output is displayed:");
    }

}
