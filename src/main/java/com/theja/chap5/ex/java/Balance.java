package com.theja.chap5.ex.java;

import com.theja.chap4.ex.java.B;

public class Balance {
    String name;
    double bal;
    Balance(String n,double b){
        name = n;
        bal = b;
    }
    void show(){
        if(bal<0)
            System.out.print("--> ");
        System.out.println(name +":$" +bal);
    }
}
