package com.inclass.easy;

/**
 * <p><b>441. Arranging Coins</b></p>
 * https://leetcode.com/problems/arranging-coins/
 */
public class ArrangingCoins {
    public static void main(String[] args) {
        long n = 5;
        System.out.println(binarySearch(n));
    }

    /**
     * Runtime: 13 ms, faster than 12.81% of Java online submissions for Arranging Coins.
     * Memory Usage: 42 MB, less than 13.21% of Java online submissions for Arranging Coins.
     * @param n
     * @return
     */
    static int linearSearch(long n) {
        long sum = 0;
        int count = 0;
        while (sum <= n) {
            sum += count;
            count++;
        }
        return count - 2;
    }

    /**
     * Runtime: 2 ms, faster than 91.02% of Java online submissions for Arranging Coins.
     * Memory Usage: 42 MB, less than 17.56% of Java online submissions for Arranging Coins.
     * @param n
     * @return
     */

    static int binarySearch(long n) {
        long start = 0;
        long end = n;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if ((mid * (mid + 1)) / 2 < n) {
                start = mid + 1;
            } else if ((mid * (mid + 1)) / 2 > n) {
                end = mid - 1;
            } else {
                return (int) mid;
            }
        }
        return (int) end;
    }
}
