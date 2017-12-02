package com.theja.chap10.ex.java;

public class GenTest {
    public static void main(String args[]){
        Gen<Integer> obj = new Gen<Integer>(88, 47);
        obj.ShowType();
        int v = obj.getob();
        System.out.println("value: " + v);
        System.out.println();

        Gen<String> str = new Gen<String>("Hello", 47);
        str.ShowType();
        String str1 = str.getob();
        System.out.println("value: " + str1);
    }
}
