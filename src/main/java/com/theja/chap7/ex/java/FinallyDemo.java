package com.theja.chap7.ex.java;

public class FinallyDemo {
    static void procA(){
        try {
            System.out.println("inside procA");
            throw new RuntimeException("Demo");
        }finally {
            System.out.println("procA finally");
        }
    }
    static void procB(){
        try {
            System.out.println("inside procB");
            return;
        }finally {
            System.out.println("procB finally");
        }
    }
    static void procC(){
        try {
            System.out.println("inside procC");
        }finally {
            System.out.println("procC finally");
        }
    }

}
