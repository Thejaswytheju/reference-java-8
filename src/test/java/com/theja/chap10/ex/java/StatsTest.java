package com.theja.chap10.ex.java;

public class StatsTest {
    public static void main(String args[]){
        Integer inums[] = {2,3,4,5,6};
        Stats<Integer> obj = new Stats<Integer>(inums);
        double v = obj.average();
        System.out.println("obj average is " + v);
        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

    }

}
