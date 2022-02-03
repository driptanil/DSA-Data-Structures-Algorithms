package com.inclass;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 5;
        System.out.println(root(n, p));
    }

    static double root (int n, int p) {
        int start = 1;
        int end = n;
        double root = 0;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (m * m == n) {
                return m;
            } else if (m > n) {
                start = m + 1;
            } else {
                end = m - 1;
                root = m;
            }
        }

        double decimal = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += decimal;
            }
            root -= decimal;
            decimal /= 10;
        }

        return root;
    }

    static double newtonRaphson (int n, int p) {
        
    }
}
