package com.inclass;

public class NoofSetBits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(rightShift(n));
        System.out.println(and(n));
    }

    static int rightShift (int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count += 1;
            }
            n = n >> 1;
        }
        return count;
    }

    static int and (int n) {
        int count = 0;
        while (n > 0) {
            count++;
            int temp = n & ((~n) + 1);
            n -= temp;
        }
        return count;
    }
}
