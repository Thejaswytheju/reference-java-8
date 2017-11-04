package com.theja.chap1.ex.java;

public class Factorial {
    public int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
