package com.theja.chap10.ex.java;

public class SimpleGenTest {
    public static void main(String args[]){
        SimpleGen<Integer,String> sg = new SimpleGen<Integer, String>(10,"generics");
        sg.ShowTypes();
        int v = sg.getObj1();
        System.out.println("value is:" + v);

        String str = sg.getObj2();
        System.out.println("value is:" + str);
    }
}
