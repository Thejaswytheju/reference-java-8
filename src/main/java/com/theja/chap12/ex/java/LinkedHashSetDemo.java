package com.theja.chap12.ex.java;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String args[]){
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        hs.add("alpha");
        hs.add("bheta");
        hs.add("gamma");
        hs.add("alpha");
        hs.add("epsilon");

        System.out.println(hs);
    }
    }

