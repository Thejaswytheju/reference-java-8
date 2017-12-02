package com.theja.chap12.ex.java;

import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String args[]) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        System.out.println("contents of all:" + integerArrayList);

        Integer integers[] = new Integer[integerArrayList.size()];
        integers = integerArrayList.toArray(integers);
        int sumOfIntegers = 0;
        for (int integer : integers) {
            sumOfIntegers += integer;
        }
        System.out.println("sum is:" + sumOfIntegers);
    }

}


