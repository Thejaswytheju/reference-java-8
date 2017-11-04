package com.theja.chap3.ex.java;

public class VaArgs {
    static void vaTest(int... v) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
}
