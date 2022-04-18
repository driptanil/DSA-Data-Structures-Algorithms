package com.inclass.pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n, n);
    }

    static void printPattern (int row, int col) {
        if (col > 0) {
            printPattern(row, col - 1);
            System.out.print("* ");
        } else if (row == 1) {
            return;
        } else {
            printPattern(row - 1, row - 1);
            System.out.println();
        }
    }
}
