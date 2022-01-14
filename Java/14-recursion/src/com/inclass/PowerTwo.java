package com.inclass;

public class PowerTwo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(power(n));
    }

    static boolean power(int n) {
        int ans = (int) (Math.log(n) / Math.log(2));
        if (n == 0) {
            return false;
        }
        else if (n == Math.pow(2,ans)) {
            return true;
        }
        return false;
    }
}
