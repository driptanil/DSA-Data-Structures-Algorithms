package com.assignments.hard;

import java.util.Arrays;

public class RainWater {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] arr2 = new int[] {4, 2, 0, 3, 2, 5};
        int[] arr3 = new int[] {2, 0, 2};
        int[] arr4 = new int[] {6,4,2,0,3,2,0,3,1,4,5,3,2,7,5,3,0,1,2,1,3,4,6,8,1,3};
        System.out.println(rainWater2(arr));
        System.out.println(rainWater2(arr2));
        System.out.println(rainWater2(arr3));
        System.out.println(rainWater2(arr4));
    }

    /**
     * <p><b>42. Trapping Rain Water</b></p>
     * https://leetcode.com/problems/trapping-rain-water/
     * <p>Runtime: 565 ms, faster than 5.01% of Java online submissions for Trapping Rain Water.</p>
     * Memory Usage: 47.7 MB, less than 73.61% of Java online submissions for Trapping Rain Water.
     * @param arr
     * @return
     */
    static int rainWater(int[] arr) {
        int rain = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int min = Math.min(arr[i], arr[j]);
            for (int k = i + 1; k < j; k++) {
                if (min > arr[k]) {
                    rain += min - arr[k];
                    arr[k] = min;
                }
            }
            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        return rain;
    }

    /**
     * <p><b>42. Trapping Rain Water</b></p>
     * https://leetcode.com/problems/trapping-rain-water/
     * <p>Runtime: 2 ms, faster than 57.31% of Java online submissions for Trapping Rain Water.</p>
     * Memory Usage: 48.6 MB, less than 53.53% of Java online submissions for Trapping Rain Water.
     * @param arr
     * @return
     */
    static int rainWater2(int[] arr) {
        int rain = 0;
        int left = 0;
        int right = arr.length - 1;
        int leftMax = arr[left];
        int rightMax = arr[right];
        while (left < right) {
            if (arr[left] < arr[right]) {
                rain += Math.max (0, leftMax - arr[left]);
                leftMax = Math.max(leftMax, arr[left]);
                left++;
            } else {
                rain += Math.max(0, rightMax - arr[right]);
                rightMax = Math.max(rightMax, arr[right]);
                right--;
            }
        }
        return rain;
    }
}
