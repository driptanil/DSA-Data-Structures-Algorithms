package com.inclass;

public class BinarySearch {

    public static void main(String[] args) {
	/*
	Binary Search: (given sorted array (say ascending)
	    1. find the middle element
	    2. if middle element == target element: ans
	    3. if middle element > target: search left
	        else middle element < target: search right
	 */
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
//        int[] arr = {48, 36, 20, 14, 12, 11, 9, 6, 4, 2};
//        int target = 36;
        if (arr[0] >= arr[arr.length - 1]) {
            System.out.println(binarySearchDes(arr, target));
        } else {
            System.out.println(binarySearchAsc(arr, target));
        }
    }

    // Binary Search for Ascending Sorted Array
    static int binarySearchAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while (start <= end) {
            index = start + (end - start) / 2;
            if (arr[index] == target) {
                return index;
            } else if (arr[index] > target) {
                end = index - 1;
            } else {
                start = index + 1;
            }
        }
        return -1;
    }

    // Binary Search for Descending Sorted Array
    static int binarySearchDes(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while (start <= end) {
            index = start + (end - start) / 2;
            if (arr[index] == target) {
                return index;
            } else if (arr[index] < target) {
                end = index - 1;
            } else {
                start = index + 1;
            }
        }
        return -1;
    }
}
