package com.inclass;

public class SetBit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(setBit(n, 2));
        System.out.println(setBit(n, 3));
    }
    static int setBit(int n, int index) {
        int mask = 1 << index;
        return (n | mask);
    }
}
