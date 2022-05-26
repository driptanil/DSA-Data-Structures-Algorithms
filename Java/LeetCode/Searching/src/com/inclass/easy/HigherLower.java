package com.inclass.easy;

/**
 * <p><b>374. Guess Number Higher or Lower</b></p>
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 */
public class HigherLower {

    static final int pick = 1702766719;

    public static void main(String[] args) {
        int n = 2126753390;
        System.out.println(guessNumber(n));
    }

    /**
     * <p><b>Given function</b></p>
     *
     * <p>1: Your guess is higher than the number I picked (i.e. num > pick).</p>
     * <p>1: Your guess is lower than the number I picked (i.e. num < pick).</p>
     * <p>0: your guess is equal to the number I picked (i.e. num == pick).</p>
     * @param n
     * @return
     */
    static int guess(int n) {
        if (pick > n) {
            return 1;
        } else if (pick < n) {
            return -1;
        }
        return 0;
    }

    /**
     *Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
     * Memory Usage: 38.8 MB, less than 97.12% of Java online submissions for Guess Number Higher or Lower.
     * @param n
     * @return pick
     */
    static int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (guess(mid) > 0) {
                start = mid + 1;
            } else if (guess(mid) < 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
