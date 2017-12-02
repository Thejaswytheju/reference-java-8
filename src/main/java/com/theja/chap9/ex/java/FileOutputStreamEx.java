package com.theja.chap9.ex.java;

import java.io.*;

public class FileOutputStreamEx{
    public static void main(String args[]) throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("out.text");
            String s = "welcome to java";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println(b);
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    }



