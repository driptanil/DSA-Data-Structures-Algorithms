package com.inclass;

public class DigitsBinary {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(leftShift(n));
        System.out.println(logBase2(n));
    }

    static int leftShift (int n) {
        for (int i = 7; i >= 0; i--) {
            if ((n & (1 << i)) == (1 << i)) {
                return i + 1;
            }
        }
        return 0;
    }

    static int logBase2 (int n) {
        return (int) (Math.log(n) / Math.log(2)) + 1;
    }
}
