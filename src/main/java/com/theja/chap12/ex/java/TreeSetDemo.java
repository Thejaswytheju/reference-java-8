package com.theja.chap12.ex.java;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("B");
        ts.add("D");
        ts.add("C");
        ts.add("E");
        ts.add("A");
        ts.add("F");
        System.out.println("elements are:"+ts);

        System.out.println(ts.subSet("C","F"));
    }

}
