package com.inclass;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        a,b=swap(a,b);
        System.out.println(a+" "+b);
    }

    static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
