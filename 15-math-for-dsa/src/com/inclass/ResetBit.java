package com.inclass;

public class ResetBit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(resetBit(n, 2));
        System.out.println(resetBit(n, 3));
    }
    static int resetBit(int n, int index) {
        int mask = 1 << index;
        return (n & (~ mask));
    }
}
