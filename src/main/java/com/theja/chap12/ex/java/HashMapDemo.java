package com.theja.chap12.ex.java;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("theja", 1101.01);
        hm.put("vidip", 1200.01);
        hm.put("varshi", 1500.20);
        hm.put("vidip", 400.0923);

        Set<HashMap.Entry<String, Double>> set = hm.entrySet();
        for (HashMap.Entry<String, Double> me : set) {
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("theja");
        hm.put("theja", balance + 1000);
        System.out.println("theja's new balance:" + hm.get("theja"));

    }
}
