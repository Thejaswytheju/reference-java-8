package com.theja.chap10.ex.java;

class GenOveride2<T> extends GenOveride<T> {
    T Ob;

    GenOveride2(T o) {
        super(o);
        Ob = o;
    }
    T getOb() {
        System.out.print("Gen2's getob(): ");
        return Ob;
    }
}
