package com.theja.chap9.ex.java;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class InputStream {
    public static void main(String args[]) throws IOException {
        FileOutputStream fin1 = new FileOutputStream("hello");
        FileOutputStream fin2 = new FileOutputStream("hai");

        ByteArrayOutputStream bit = new ByteArrayOutputStream();
        bit.write(65);
        bit.writeTo(fin1);
        bit.writeTo(fin2);
        bit.close();
        System.out.print("success");

    }
}
