package com.theja.chap10.ex.java;

public class MinMaxTest {
    public static void main(String args[]){
        Integer nums[] = {3, 6, 2, 8, 6 };
        Character chs[] = {'b', 'r', 'p', 'w'};
        MinMax.MyClass<Integer> m1 = new MinMax.MyClass<Integer>(nums);
        MinMax.MyClass<Character> m2 = new MinMax.MyClass<Character>(chs);

        System.out.println("Max value in nums: " + m1.max());
        System.out.println("Min value in nums: " + m2.min());

        System.out.println("Max value in chs: " + m1.max());
        System.out.println("Min value in chs: " + m2.min());
    }
}
