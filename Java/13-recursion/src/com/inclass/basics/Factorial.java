package com.inclass.basics;

public class Factorial {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(factorial(n));
        System.out.println(fact(n, 1));
    }

    static int fact(int n, int factorial) {
        if (n == 0) {
            return factorial;
        }
        factorial *= n;
        return fact(n - 1, factorial);
    }

    static int factorial (int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
