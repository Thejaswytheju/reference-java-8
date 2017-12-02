package com.theja.chap10.ex.java;

public class GenOverideTest {
    public static void main(String args[]){
      GenOveride<Integer> obj1 = new GenOveride<Integer>(98);
      GenOveride2<Integer> obj2 = new GenOveride2<Integer>(55);
      GenOveride<String> str = new GenOveride<String>("generic overide");

        System.out.println(obj1.getOb());
        System.out.println(obj2.getOb());
        System.out.println(str.getOb());
    }
}
