package com.questions.medium;

public class DiceSum {
    public static void main(String[] args) {
        int n = 2; // no of dice
        int k = 6; // no of die faces
        int target = 7; // target sum
        System.out.println(recursion(n, k, target));
    }

    static int recursion(int n, int k, int target) {
        int count = 0;
        if (n == 1) {
            if (target <= k) {
                count++;
            }
            return count;
        }
        for (int i = 1; i <= k && i <= target; i++) {
            count += recursion(n - 1, k, target - i);
        }
        return count;
    }

}
