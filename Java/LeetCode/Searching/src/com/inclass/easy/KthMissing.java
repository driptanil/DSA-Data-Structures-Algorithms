package com.inclass.easy;

/**
 * <p><b>1539. Kth Missing Positive Number</b></p>
 * https://leetcode.com/problems/kth-missing-positive-number/
 */
public class KthMissing {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 4, 7, 11};
        int target = 5;
        System.out.println(linearSearch(arr, target));
    }

    /**
     * Runtime: 1 ms, faster than 37.35% of Java online submissions for Kth Missing Positive Number.
     * Memory Usage: 43.6 MB, less than 23.96% of Java online submissions for Kth Missing Positive Number.
     * @param arr
     * @param target
     * @return
     */
    static int linearSearch(int[] arr, int target) {
        int count = 0;
        int k = 0;
        while (true) {
            if (count < arr.length && count + k == arr[count]) {
                count++;
            } else {
                if (k == target) {
                    return count + k;
                } else {
                    k++;
                }
            }
        }
    }
}
