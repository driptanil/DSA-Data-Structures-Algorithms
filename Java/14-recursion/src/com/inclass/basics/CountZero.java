package com.inclass.basics;

public class CountZero {
    public static void main (String[] args) {
        int n = 10030;
        System.out.println(zero(n, 0));
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
}
