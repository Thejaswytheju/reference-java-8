package com.theja.chap6.ex.java;

import com.theja.chap5.ex.java.Protection;

public class Protection2 extends Protection {
    Protection2() {

        System.out.println("derived other package constructor");

        //System.out.println("n = " + n);

        // System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
