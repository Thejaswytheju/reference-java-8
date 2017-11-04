package com.theja.chap5.ex.java;

public class Rectangle extends Figure {
     Rectangle(double a,double b){
        super(a,b);
    }
    double Area(){
         System.out.println("Inside area of rectangle:");
         return dim1*dim2;
    }
}
