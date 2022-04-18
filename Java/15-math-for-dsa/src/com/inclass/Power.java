package com.inclass;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        System.out.println(power(base, power));
    }

    static int power(int base, int power) {
        int ans = 1;
        while(power > 0) {
            if ( (power & 1) == 1) {
                ans = ans * base;
            }
            base *= base;
            power = power >> 1;
        }
        return ans;
    }
}
