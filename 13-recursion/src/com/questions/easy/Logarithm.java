package com.questions.easy;

public class Logarithm {
    public static void main(String[] args) {
        int n = 9;
        int a = 3;
        System.out.println(norecursion(n, a));
        System.out.println(recursion(n, a, 1));
    }

    static int norecursion(int n, int a) {
        int ans = (int) Math.round(Math.log(n) / Math.log(a));
        return ans;
    }

    static int recursion(int n, int a, int power) {
        int temp = (int) Math.pow(a, power);
        if (n / temp == 1) {
            return power;
        }
        if (n % temp == 0) {
            return recursion(n, a, power + 1);
        }
        return -1;
    }
}
