package com.assignments;

import java.util.Arrays;

public class PrimeInRange {
    public static void main(String[] args) {
    }

    /**
     * <b>2523. Closest Prime Numbers in Range</b>
     * https://leetcode.com/problems/closest-prime-numbers-in-range
     * Runtime 257 ms Beats 48.45%
     * Memory 42.1 MB Beats 81.61%
     * @param left
     * @param right
     * @return
     */
    static int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        // starting for 2 element
        isPrime[0] = true;
        isPrime[1] = true;

        for(int i = 2; i * i <= right; i++) {
            for (int j = 2 * i; j <= right; j += i) {
                isPrime[j] = true;
            }
        }
        int diff = 0;
        int minDiff = right - left + 1;
        int prevIndex = right;
        int minIndex = left;
        for (int i = left; i <= right; i++) {
            if (!isPrime[i]) {
                if (prevIndex < i) {
                    if (minDiff > diff) {
                        minDiff = diff;
                        minIndex = prevIndex;
                    }
                }
                prevIndex = i;
                diff = 0;
            } else {
                diff++;
            }
        }

        if (minDiff == right - left + 1) {
            return new int[] {-1, -1};
        }

        return new int[] {minIndex, minIndex + minDiff + 1};


    }

}
