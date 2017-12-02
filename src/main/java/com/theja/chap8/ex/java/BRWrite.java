package com.theja.chap8.ex.java;

import java.io.PrintWriter;

public class BRWrite {
    public static void main(String args[]){

        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("i am awesome:");
        int i = 7;
        pw.println(i);
        double d = 45.2f;
        pw.println(d);
    }

}
