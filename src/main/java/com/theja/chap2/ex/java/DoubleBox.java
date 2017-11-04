package com.theja.chap2.ex.java;

public class DoubleBox {
    double width;
    double height;
    double breadth;

    DoubleBox(double w,double h,double b){
        width = w;
        height = h;
        breadth = b;

    }

     double volume() {
        return height*width*breadth;
    }
}
