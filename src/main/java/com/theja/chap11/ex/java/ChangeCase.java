package com.theja.chap11.ex.java;

public class ChangeCase {
    public static void main(String args[]){
        String s = "this is a test";
        System.out.println("original is:");

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();

        System.out.println("upper:" +upper);
        System.out.println("lower:" +lower);
    }
}
