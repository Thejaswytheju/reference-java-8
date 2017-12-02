package com.theja.chap5.ex.java;

import com.theja.chap5.ex.java.Derived;
import com.theja.chap5.ex.java.Protection;

public class ProtectionTest {
    class OtherPackage {
        OtherPackage() {
            Protection p = new Protection();
            System.out.println("other package constructor");
            // System.out.println("n = " + p.n);

            // System.out.println("n_pri = " + p.n_pri);

            // System.out.println("n_pro = " + p.n_pro);
            System.out.println("n_pub = " + p.n_pub);
        }
    }
}



