package com.theja.chap1.ex.java;

public class Sum {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int Sum =0;
        for (int x:nums){
            System.out.println("the value of x is:" +x);
            Sum += x;
            if(x==5)
                break;
            }
            System.out.println("summation of first 5 elements are:"+ Sum);
        }
    }

