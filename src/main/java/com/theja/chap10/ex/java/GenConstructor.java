package com.theja.chap10.ex.java;

public class GenConstructor {
    private double value;

    <T extends Number>GenConstructor(T arg) {
        value = arg.doubleValue();
    }
    void showValue(){
        System.out.println("value is:" + value);
    }
    public static void main(String args[]){
        GenConstructor t1 = new GenConstructor(Integer.valueOf(100));
        GenConstructor t2 = new GenConstructor(Float.valueOf(25.6f));
        t1.showValue();
        t2.showValue();
    }

}


