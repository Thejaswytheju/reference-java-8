package com.theja.chap12.ex.java;

public class Address {
    String name;
    String street;
    String state;
    String code;
    Address(String n,String s,String st,String c){
        name = n;
        street = s;
        state = st;
        code = c;
    }
    public String toString(){

        return name + "\n" + street + "\n" + state + " " + code;
    }

}
