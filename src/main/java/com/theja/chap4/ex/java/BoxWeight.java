package com.theja.chap4.ex.java;

public class BoxWeight extends Box{
    double weight;



    BoxWeight(double w,double h,double l,double m ) {
        super(w, h, l);
        weight = m;
    }

    public double weight() {
        return weight;

    }
}