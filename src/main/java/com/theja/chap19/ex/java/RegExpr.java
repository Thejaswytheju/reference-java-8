package com.theja.chap19.ex.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    public static void main(String args[]) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 8");

        System.out.println("Looking for Java in Java 8.");

        if(mat.find())
            System.out.println("subsequence found");
        else System.out.println("No Match");
    }
}
