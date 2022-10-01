package com.inclass.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n, n);
    }

    static void printPattern (int row, int col) {
        if (col > 0) {
            System.out.print("* ");
            printPattern(row, col - 1);
        } else if (row == 1) {
            return;
        } else {
            System.out.println();
            printPattern(row - 1, row - 1);
        }
    }
}
