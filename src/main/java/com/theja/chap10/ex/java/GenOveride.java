package com.theja.chap10.ex.java;

public class GenOveride<T> {
    T Ob;
    GenOveride(T o){
        Ob = o;
    }
    T getOb() {
        System.out.print("Gen's getob(): " );
        return Ob;
    }
}
