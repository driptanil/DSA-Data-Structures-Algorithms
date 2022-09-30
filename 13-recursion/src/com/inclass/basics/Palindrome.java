package com.inclass.basics;

public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(palindrome(n));
    }

    static boolean palindrome (int n) {
        if (n / 10 == 0) {
            return true;
        }
        if (n / (int) Math.pow(10, (int) Math.log10(n)) == n % 10) {
            return palindrome((n % (int) Math.pow(10, (int) Math.log10(n)) - (n % 10)) / 10);
        }
        return false;
    }
}
