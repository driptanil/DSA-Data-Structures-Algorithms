package com.inclass;

public class SumofRowofPascelTriangle {
    public static void main(String[] args) {
        int row = 5;
        System.out.println(power(row));
    }

    static int power(int row) {
        return 1 << (row + 1);
    }
}
