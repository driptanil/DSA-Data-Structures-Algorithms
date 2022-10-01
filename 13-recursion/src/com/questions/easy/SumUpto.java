package com.questions.easy;

public class SumUpto {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumUpto(n));
    }

    static int sumUpto(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUpto(n - 1);
    }
}
