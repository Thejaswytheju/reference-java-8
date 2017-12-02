package com.theja.chap11.ex.java;

public class SetCharAt {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("before:" +sb);
        System.out.println("bfr is:" +sb.charAt(1));
        sb.setCharAt(1,'i');
        sb.setLength(2);
        System.out.println("after:" +sb);
        System.out.println("aftr:"+sb.charAt(1));

    }
}
