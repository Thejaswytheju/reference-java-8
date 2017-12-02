package com.theja.chap11.ex.java;

public class IndexOf {
    public static void main(String args[]){
        StringBuffer br = new StringBuffer("one,two,one");
        int i;
        i = br.indexOf("one");
        System.out.println("first index:" +i);
        i = br.lastIndexOf("one");
        System.out.println("last index:" +i);
    }
}
