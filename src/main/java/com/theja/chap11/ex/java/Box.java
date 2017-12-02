package com.theja.chap11.ex.java;

public class Box {
    double width;
    double height;
    double weight;
    Box(double w,double h,double m){
        width=w;
        height=h;
        weight=m;
    }
    public String toString(){
        return "Dimensions are " + width + " by " +  weight + " by " + height + ".";
    }
}
