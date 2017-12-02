package com.theja.chap11.ex.java;

public class Equals {
    public static void main(String args[]){
        String s1 = "hello";
        String s2 = "HELLO";
        String s3 = "hai";
        String s4 = "hello";
        System.out.println(s1 + "equals"+s2 +"->"+s1.equals(s2));
        System.out.println(s1 + "equals"+s3 +"->"+s1.equals(s3));
        System.out.println(s1 + "equals"+s4 +"->"+s1.equals(s4));
        System.out.println(s1 + "equals"+s2 +"->"+s1.equalsIgnoreCase(s2));
    }

}
