package com.theja.chap9.ex.java;

import java.io.Console;
import java.io.IOException;


public class StringTest {
    public static void main(String args[]) throws IOException{
        Console c=System.console();
        System.out.println("Enter password: ");
        char[] ch=c.readPassword();
        String pass=String.valueOf(ch);
        System.out.println("Password is: "+pass);
    }
}
