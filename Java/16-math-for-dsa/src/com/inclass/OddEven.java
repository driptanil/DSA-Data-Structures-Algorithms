package com.inclass;

public class OddEven {
    public static void main(String[] args) {
        int n = 66;
        System.out.println(oddCheck(n));
    }
    static boolean oddCheck(int n) {
        return (n & 1) == 1;
    }
}
