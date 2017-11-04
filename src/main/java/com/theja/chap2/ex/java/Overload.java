package com.theja.chap2.ex.java;

public class Overload {
    public Overload(){

    }
    void test(){
        System.out.println("no parameters");
    }
    void test(int a,int b){
        System.out.println("a + b is:" +a + " "+b);
    }
    void test(double a){
        System.out.println("Inisde test (Double)a:"  + a);
    }
}
