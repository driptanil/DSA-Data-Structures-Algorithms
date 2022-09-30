package com.inclass;

public class Prime {
    public static void main(String[] args) {
        int n = 40;
        arrayBoolean(n);
    }

    static void arrayBoolean(int n) {
        boolean[] bool = new boolean[n - 2];
        for (int i = 2; i * i <= n; i++) {
            for (int j = i * 2; j < n; j++) {
                if (!bool[j - 2] && j % i == 0) {
                    bool[j - 2] = true;
                }
            }
            printArrayBoolean(bool);
        }
        printArrayBoolean(bool);
    }

    static void printArrayBoolean(boolean[] bool) {
        for (int j = 0; j < bool.length; j++) {
            if (!bool[j]) {
                System.out.print(j + 2 + ", ");
            }
        }
        System.out.println();
    }
}