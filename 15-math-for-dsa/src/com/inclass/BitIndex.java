package com.inclass;

public class BitIndex {
    public static void main(String[] args) {
        int n = 12;
        int index = 2;
        System.out.println(bit(n, index));
    }
    static int bit(int n, int index) {
        int mask = 1 << (index);
        return (n & mask) >> (index);
    }
}
