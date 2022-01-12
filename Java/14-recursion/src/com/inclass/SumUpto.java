package com.inclass;

public class SumUpto {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumUpto(n, 0));
    }

    static int sumUpto(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        sum = sum + n;
        return sumUpto(n - 1, sum);
    }
}
