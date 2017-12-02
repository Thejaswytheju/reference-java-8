package com.theja.chap12.ex.java;

import java.util.LinkedList;

public class AddressMail{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add(String.valueOf(new Address("chintu","kk nagar","chennai","1123")));
        ll.add(String.valueOf(new Address("kutty","jj nagar","chennai","1135")));
        for (String element : ll){
            System.out.println(element);
        }
    }
}
