package com.theja.chap19.ex.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String args[]) {

        LocalDateTime curDateTime =
                LocalDateTime.parse("June 21, 2014 12:01 AM",
                        DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));

        System.out.println(curDateTime.format(
                DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
