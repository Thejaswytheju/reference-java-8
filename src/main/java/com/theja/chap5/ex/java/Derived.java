package com.theja.chap5.ex.java;

public class Derived extends Protection {
    Derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);

        // System.out.println("n_pri = "4 + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

    public static class SamePackage {
        SamePackage() {
            Protection p = new Protection();
            System.out.println("same package constructor");
            System.out.println("n = " + p.n);

            // System.out.println("n_pri = " + p.n_pri);
            System.out.println("n_pro = " + p.n_pro);
            System.out.println("n_pub = " + p.n_pub);
        }
    }
}
