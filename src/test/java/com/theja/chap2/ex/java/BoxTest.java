package com.theja.chap2.ex.java;

public class BoxTest {
    public static void main(String args[]){
        Box myBox = new Box();
        double vol;
        myBox.height=10;
        myBox.length=12;
        myBox.width=14;
        vol=myBox.height * myBox.width * myBox.length;
        System.out.println("volume is:" +vol);
    }
}
