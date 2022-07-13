// package com.questions.easy;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(prime(n, 2));
    }

    static boolean prime(int n, int fact) {
        if (fact * fact > n) {
            return true;
        } if (n % fact == 0) {
            return false;
        } return prime (n, fact + 1);
    }
}
