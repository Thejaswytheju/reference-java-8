package com.theja.chap14.ex.java;

import java.util.Date;

public class DateDemo {
    public static void main(String args[]) {

        Date date = new Date();

        System.out.println(date);

        // Display number of milliseconds since midnight, January 1, 1970 GMT
        long msec = date.getTime();

        System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
    }
}
