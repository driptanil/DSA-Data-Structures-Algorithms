package com.inclass.basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
        System.out.println(ultfibo(n, 0, 1));
    }

    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
    Memory Usage: 38.9 MB, less than 49.59% of Java online submissions for Fibonacci Number.
     */
    static int ultfibo (int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        return ultfibo(n - 1, b, a + b);
    }
}
