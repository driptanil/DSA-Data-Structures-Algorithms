package com.questions.easy;

public class Product {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(product(a, b));
    }

    static int product(int a, int b) {
        if (b == 1) {
            return a;
        } return a + product(a, b - 1);
    }
}
