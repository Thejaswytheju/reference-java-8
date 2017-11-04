package com.theja.chap5.ex.java;

public class B1 extends A1 {
    int k;

    B1(int a, int b,int c) {
        super(a, b);
        k = c;
    }

    void show(){
        super.show();
        System.out.println("k is:" +k);
    }
}
class Overide{
    public static void main(String args[]){
        B1 suprObj = new B1(1,2,3);
        suprObj.show();
    }
}