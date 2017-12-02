package com.theja.chap11.ex.java;

public class SortString {
    static String arr[] = {"Hello","how","are","you","how","do","you","do"};

    public static void main(String args[]){
        for (int j=0;j<arr.length;j++){
            for (int i=j+1;i<arr.length;i++){
                if (arr[i].compareTo(arr[j])<0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
             System.out.println(arr[j]);
    }
}
    }

