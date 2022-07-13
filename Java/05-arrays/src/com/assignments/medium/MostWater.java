package com.assignments.medium;

public class MostWater {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    // time limit exceeded
    static int maxArea(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i] > arr[j] ? arr[j] * (j - i) : arr[i] * (j - i);
                if (temp > max)
                    max = temp;
            }
        }
        return max;
    }

    /**
     * <p><b>11. Container With Most Water</b></p>
     * https://leetcode.com/problems/container-with-most-water/
     * <p>Runtime: 4 ms, faster than 82.66% of Java online submissions for Container With Most Water.</p>
     * Memory Usage: 81.3 MB, less than 32.18% of Java online submissions for Container With Most Water.
     * @param arr
     * @return
     */
    static int betterMaxArea(int[] arr) {
        int max = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i] > arr[j] ? arr[j] * (j - i) : arr[i] * (j - i);
            if (arr[i] < arr[j])
                i++;
            else
                j--;
        }
        return max;
    }
}
