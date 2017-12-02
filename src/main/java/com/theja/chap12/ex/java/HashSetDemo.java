package com.theja.chap12.ex.java;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();
        hs.add("alpha");
        hs.add("bheta");
        hs.add("gamma");
        hs.add("alpha");
        hs.add("epsilon");

        System.out.println(hs);
    }

}
