package com.questions.easy;

import java.util.Scanner;

public class Geekonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println(geek(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
        }
    }

    static int geek(int a, int b, int c, int n) {
        if (n == 1) {
            return a;
        }
        return geek(b, c, a + b + c, n - 1);
    }
}
