package com.inclass;

public class MaxWealth {

    public static void main(String[] args) {
        int[][] acc = {{1, 5}, {7, 3}, {3, 5}};
        int max = 0;
        for (int[] ints : acc) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximum Wealth: " + max);
    }
}
