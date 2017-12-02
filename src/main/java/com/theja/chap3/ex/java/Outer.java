package com.theja.chap3.ex.java;

class Outer {
    int outer_x = 100;
    void test() {
        for(int i=0; i<10; i++) {
            outer_x = i;
            class Inner {
                void display() {

                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }

}

