package com.theja.chap12.ex.java;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String args[]){
        ArrayDeque<String> adq = new ArrayDeque<String>();
        adq.push("A");
        adq.push("B");
        adq.push("C");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.println("popping the stack: ");

        while(adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();
        }
    }

