package com.inclass.basics;

public class CountZero {
    public static void main (String[] args) {
        int n = 10030;
        System.out.println(zero(n, 0));
        System.out.println(zero2(n));
    }

    static int zero (int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return zero(n / 10, count);
    }

    static int zero2 (int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 != 0) {
            return zero2(n / 10);
        }
        return 1 + zero2(n / 10);
    }
}
