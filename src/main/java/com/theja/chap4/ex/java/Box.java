package com.theja.chap4.ex.java;

public class Box {

    double width;
    double height;
    double length;
     Box(Box b){
        width = b.width;
        height = b.height;
        length = b.length;
    }
    Box(double w,double h,double l){
        width = w;
        height =h;
        length = l;
    }

    public Box() {
    }

    void Box(){
        width = -1;
        height = -1;
        length = -1;
    }
    Box(double depth){
        width=height=length=depth;
    }

    double volume(){
        return width*height*length;
    }

}
