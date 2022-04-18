package com.inclass;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        bruteForce(n);
        checkRoot(n);
    }

    static void bruteForce (int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    static void checkRoot (int n) {
        ArrayList<Integer> list = new ArrayList<> (0);
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        for (int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(list.size() - i) + ", ");
        }
        System.out.println();
    }
}
