package com.theja.chap5.ex.java;

public class FigureTest {
    public static void main(String args[]){
        Figure f = new Figure(1,2);
        Rectangle r = new Rectangle(5,7);
        Triangle t = new Triangle(8,10);

        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.Area());
        figref = t;
        System.out.println("Area is " + figref.Area());
        figref = f;
        System.out.println("Area is " + figref.Area());
    }
}
