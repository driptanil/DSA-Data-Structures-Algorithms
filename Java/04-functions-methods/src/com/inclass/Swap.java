package com.inclass;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        swap(a,b);
        System.out.println(a+" "+b);
    }

    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
