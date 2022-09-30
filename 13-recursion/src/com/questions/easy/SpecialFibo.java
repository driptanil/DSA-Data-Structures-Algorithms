package com.questions.easy;

import java.util.Scanner;

public class SpecialFibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int i = 0; i < test; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(special(n, a, b));
        }
    }

    static int special(int c, int a, int b) {
        if (c == 0) {
            return a;
        }
        return special(c - 1, b, b ^ a);
    }
}
