package com.theja.chap3.ex.java;

class StringDemo2 {
    public static void main(String args[]) {
        String s1 = "First String";
        String s2 = "Second String";
        String s3 = s1;
        System.out.println("Length of strOb1: " + s1.length());
        System.out.println("Char at index 3 in strOb1: " + s1.charAt(3));
        if (s1.equals(s2))
            System.out.println("true");
        else
            System.out.println("false");
        if (s1.equals(s3))
            System.out.println("true");
        else
            System.out.println("false");
    }
}





