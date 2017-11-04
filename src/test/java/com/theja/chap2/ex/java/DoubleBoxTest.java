package com.theja.chap2.ex.java;

public class DoubleBoxTest {
    public static void main(String args[]){
        DoubleBox myBox1 = new DoubleBox(10,20,30);
        DoubleBox myBox2 = new DoubleBox(12,14,13);
        double vol;

        vol = myBox1.volume();
        System.out.println("volume is:" + vol);
        vol = myBox2.volume();
        System.out.println("volume is:" + vol);

    }
}
