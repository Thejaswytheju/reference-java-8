package com.theja.chap12.ex.java;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String args[]){
        ArrayList<Integer> vals = new ArrayList<Integer>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        System.out.println("contents of the elements:" +vals);
        System.out.println();
        int sum = 0;
        for(int v:vals){
        sum+=v;
        System.out.println("sum of values:" +sum);
        }

    }

}
