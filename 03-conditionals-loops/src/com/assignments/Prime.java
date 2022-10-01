package com.assignments;

public class Prime {
    public static void main(String[] args) {
        int start = 5;
        int end = 11;
        primeSet(start, end);
    }

    static boolean primeOrNot (int n) {
        if (n < 2) {
            return false;
        }
        int i = 2;
        while (i * i <= n) {
            if (n % i++ == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeSet (int start, int end) {
        while(start++ <= end) {
            if (primeOrNot(start)) {
                System.out.print(start + ", ");
            }
        }
    }
}
