package com.inclass;

public class EuclidHCF {
    public static void main(String[] args) {
        int a = 18;
        int b = 8;
        System.out.println(recursion(a, b));
        System.out.println(lcm(a, b));
    }

    static int euclid (int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (a % b != 0) {
            int temp = a;
            a = a % b;
            b = temp;
        }
        return b;
    }

    static int recursion (int a, int b){
        if (a == 0) {
            return b;
        }
        if (a > b) {
            return recursion(a % b, a);
        }
        return recursion(b % a, a);
    }

    static int lcm (int a, int b) {
        return a * b / recursion(a, b);
    }
}
