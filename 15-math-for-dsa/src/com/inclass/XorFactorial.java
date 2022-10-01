package com.inclass;

public class XorFactorial {
    public static void main(String[] args) {
        int low = 3;
        int high = 6;
        System.out.println(xorFactorial(low, high));
    }

    static int xorFactorial(int low, int high) {
        return (low - 1) & high;
    }
}
