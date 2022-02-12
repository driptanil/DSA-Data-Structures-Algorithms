package com.inclass.basics;

public class ReverseInt {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(reverse(n));
    }

    static int reverse (int n) {
        if (n == 0) {
            return 0;
        }
        if ((int) Math.log10(Math.abs(n)) == 0) {
            return n;
        }
        return (int) (((n % 10) * Math.pow(10, (int) Math.log10(Math.abs(n)))) + reverse(n / 10));
    }
}
