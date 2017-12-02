package com.theja.chap9.ex.java;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String args[]) throws IOException {
            try {
                FileInputStream fin = new FileInputStream("out.text");
                int i=fin.read();
                System.out.print((char)i);
                fin.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

