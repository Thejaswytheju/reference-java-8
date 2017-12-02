package com.theja.chap11.ex.java;

public class SubString {
    public static void main(String args[]){
        byte ascii[] = {20,66,67,68,69};
        String s1 = new String(ascii);
        String s2 = new String(ascii,2,3);
        System.out.println(s1);
        System.out.println(s2);
    }

}
