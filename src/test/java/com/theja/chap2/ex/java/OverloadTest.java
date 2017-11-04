package com.theja.chap2.ex.java;

public class OverloadTest {
    public static void main(String args[]){
        Overload od = new Overload();
        int i=18;
        od.test();
        od.test(10,20);
        od.test(i);
        od.test(123.2);
        od.test(45);
    }
}
