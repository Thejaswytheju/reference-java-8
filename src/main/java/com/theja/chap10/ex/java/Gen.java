package com.theja.chap10.ex.java;

public class Gen<T> {

    T ob;
    Gen(T o, int i){
        ob = o;
    }
    T getob(){
        return ob;
    }
    void ShowType(){
        System.out.println(("Type of T is " +ob.getClass().getName()));
    }

}
