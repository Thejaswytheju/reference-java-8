package com.theja.chap12.ex.java;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseCollection implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}


