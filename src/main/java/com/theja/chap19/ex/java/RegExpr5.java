package com.theja.chap19.ex.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr5 {
    public static void main(String args[]) {
        // Match lowercase words.
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while(mat.find())
            System.out.println("Match: " + mat.group());
    }
}
