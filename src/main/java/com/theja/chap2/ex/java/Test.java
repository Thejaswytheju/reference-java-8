package com.theja.chap2.ex.java;

public class Test {
    int a;
    public Test(){

    }

    public Test(int i) {
        a = i;
    }

    Test incrByTen(){
        Test Temp = new Test(a+10);
        return Temp;
    }

}
