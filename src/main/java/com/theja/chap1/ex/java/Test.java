package com.theja.chap1.ex.java;

public class Test {
    public static void main(String args[]){
        int lightspeed = 1860;
        long days = 10;
        long seconds = days * 60 * 24*60;
        long distance = lightspeed * seconds;
        System.out.print("In" + days);
        System.out.print("system will travel about");
        System.out.print(distance + "miles");
    }
}
