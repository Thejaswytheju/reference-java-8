package com.theja.chap12.ex.java;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]) {
        TreeMap<String, Double> tm= new TreeMap<String, Double>();
        tm.put("theja", 1101.01);
        tm.put("vidip", 1200.01);
        tm.put("varshi", 1500.20);

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("theja");
        tm.put("theja", balance + 1000);
        System.out.println("theja's new balance:" + tm.get("theja"));

    }
}

