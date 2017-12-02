package com.theja.chap12.ex.java;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        System.out.println("elements are:" +ll);
        ll.add(1,"B");
        ll.remove(3);
        System.out.println("after change:"+ll);
        ll.addFirst("A");
        ll.removeLast();
        System.out.println("final elements are:" +ll);
    }

}
