package com.theja.chap10.ex.java;

public class NonGen<S> {
    int num;

    NonGen(String hello, int i) {
        num = i;
    }

    int getNum() {
        return num;
    }

    public void getob() {
        return ;
    }

    class Gen<T> extends NonGen<S> {
        T ob;

        Gen(T o, int i) {
            super("Hello", i);
            ob = o;
        }

    }
}

