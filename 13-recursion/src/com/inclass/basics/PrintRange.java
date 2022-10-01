package com.inclass.basics;

public class PrintRange {
    public static void main(String[] args) {
        int n = 5;
        print(n);
        System.out.println();
        reversePrint(n);
    }
    static void print (int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + ", ");
        print(n - 1);
    }

    static void reversePrint (int n) {
        if (n == 0) {
            return;
        }
        reversePrint(n - 1);
        System.out.print(n + ", ");
    }
}
