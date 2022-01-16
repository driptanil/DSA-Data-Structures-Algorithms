package com.inclass;

public class Powerof2 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(powerCheck(n));
    }

    static boolean powerCheck(int n) {
        return (n & (n - 1)) == n;
    }
}
