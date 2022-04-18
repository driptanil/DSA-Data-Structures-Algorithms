package com.questions.easy;

public class Prime {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(prime(n, 2));
    }

    static boolean prime(int n, int fact) {
        if (fact * fact > n) {
            return true;
        } if (n % fact == 0) {
            return false;
        } return prime (n, fact + 1);
    }
}
