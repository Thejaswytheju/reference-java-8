package com.theja.chap7.ex.java;

import java.lang.Exception;

import static com.theja.chap7.ex.java.FinallyDemo.procA;
import static com.theja.chap7.ex.java.FinallyDemo.procB;
import static com.theja.chap7.ex.java.FinallyDemo.procC;

public class FinallyDemoTest {
    public static void main(String args[]){
        try {
            procA();
        }catch (Exception e){
            System.out.println("Éxception caught");
        }
        procB();
        procC();
    }
}
