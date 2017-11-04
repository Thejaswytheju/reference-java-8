package com.theja.chap5.ex.java;

public class Protection {
    int n;
    public int n_pub;
    private int n_pri;
    protected int n_pro;

    public Protection(){
        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
