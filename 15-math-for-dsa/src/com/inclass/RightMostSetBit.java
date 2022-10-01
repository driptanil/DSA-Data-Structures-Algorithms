package com.inclass;

public class RightMostSetBit {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(rightmostSetBit(n));
    }

    static int rightmostSetBit(int n) {
        return n & ((~ n) + 1);
    }
}
