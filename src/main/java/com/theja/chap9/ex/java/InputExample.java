package com.theja.chap9.ex.java;

import java.io.ByteArrayInputStream;

public class InputExample {
    public static void main(String args[]){
        byte b[] = {10,12,13,14};

        ByteArrayInputStream bit = new ByteArrayInputStream(b);
        int k = 0;
        while ((k=bit.read())!= -1){
            char ch = (char)k;
            System.out.print("ASCII value is:" + k + "; Special character is: " + ch);
        }
    }
}
