package com.theja.chap2.ex.java;

public class RetOb {
    public static void main(String args[]){
        Test ob1 = new Test(10);
        Test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a is:" + ob1.a);
        System.out.println("ob2.a is:" +ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2 after second increase:" + ob2.a);
    }
}
