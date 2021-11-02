package com.leetcode;

public class Q81_Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        int target = 3;
        System.out.println(leetCode(arr, target));
    }

    static boolean leetCode(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int index = start + (end - start) / 2;
            if (arr[index] == target) { // check for target
                return true;
            } else if (arr[index] < arr[end] || arr[index] < arr[start]) { // check for right sorted
                if (arr[index] < target && target <= arr[end]) {
                    start = index + 1;
                } else {
                    end = index - 1;
                }
            } else if (arr[index] > arr[end] || arr[index] > arr[start] ) { // check for left side sorted
                if (arr[start] <= target && target < arr[index] ){
                    end = index - 1;
                } else {
                    start = index + 1;
                }
            } else { // arr[start] == arr[index] == arr[end]
                end--;
            }
        }
        return false;
    }
}
