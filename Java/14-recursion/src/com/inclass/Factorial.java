package com.inclass;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n, 1));
    }

    static int fact(int n, int factorial) {
        if (n == 0) {
            return factorial;
        }
        factorial *= n;
        return fact(n - 1, factorial);
    }
}
