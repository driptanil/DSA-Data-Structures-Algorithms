package com.questions.easy;

public class StepsToZero {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(steps(n));
        System.out.println(stepsRec(n, 0));
        System.out.println(numberOfSteps(n));
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
    Memory Usage: 39.2 MB, less than 18.26% of Java online submissions for Number of Steps to Reduce a Number to Zero.
     */
    static int stepsRec(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 1) {
            return stepsRec(n - 1, count + 1);
        }
        return stepsRec(n / 2, count + 1);
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
    Memory Usage: 39 MB, less than 18.91% of Java online submissions for Number of Steps to Reduce a Number to Zero.
     */
    static int steps (int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                n -= 1;
                count++;
            } else {
                n /= 2;
                count++;
            }
        }
        return count;
    }

    static int numberOfSteps(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 1)
            return 1 + numberOfSteps(n - 1);
        return 1 + numberOfSteps(n/2);
    }
}
