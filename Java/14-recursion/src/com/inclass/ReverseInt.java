package com.inclass;

public class ReverseInt {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n));
    }

    static int reverse (int n) {
        int temp = n % 10;
        if (n == 0) {
            return 0;
        }
        System.out.println(temp);
        return temp * 10 + reverse((int) n / 10) * 10;
    }
}
