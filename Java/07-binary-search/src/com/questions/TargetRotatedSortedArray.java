package com.questions;

public class TargetRotatedSortedArray {

    // https://leetcode.com/problems/search-in-rotated-sorted-array/

    public static void main(String[] args) {
        System.out.println(bestSolution());
    }

    /* Self Attempt:
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
    Memory Usage: 39.7 MB, less than 11.53% of Java online submissions for Search in Rotated Sorted Array.
     */
    static int selfAttempt(int[] arr, int target) {
        int peak = peak(arr);
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, peak);
        } else {
            return binarySearch(arr, target, peak + 1, arr.length - 1);
        }
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            return end;
        } else {
            while (start < end) {
                int index = start + (end - start) / 2;
                if (arr[index] > arr[start]) {
                    start = index;
                } else {
                    end = index;
                }
            }
            return start;
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end) {
            int index = start + (end - start) / 2;
            if (target < arr[index]) {
                end = index - 1;
            } else if (target > arr[index]) {
                start = index + 1;
            } else {
                return index;
            }
        }
        return -1;
    }

    /* Solution:

     */
    static int solution(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        else {
            if (arr[pivot] == target) {
                return pivot;
            } else if (target > arr[0]) {
                return binarySearch(arr, target, 0, pivot);
            } else {
                return binarySearch(arr, target, pivot + 1, arr.length - 1);
            }
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int index = start + (end - start) / 2;
            if (index < end && arr[index] > arr[index + 1]) {
                return index;
            } else if (index > start && arr[index - 1] > arr[index]) {
                return index - 1;
            } else if (arr[index] <= arr[start]) {
                end = index - 1;
            } else {
                start = index + 1;
            }
        }
        return -1;
    }


    /* Best Solution (no need to find peak, works with duplicates) :
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
    Memory Usage: 39.2 MB, less than 42.77% of Java online submissions for Search in Rotated Sorted Array.
     */
    static int bestSolution() {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 0};
        int target = 0;
        return binarySearch1(arr, target);
    }

    static int binarySearch1(int[] nums,int target) {
        int left = 0;
        int right = nums.length -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            //cout<<nums[mid]<<"\n";
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>=nums[left])
            {
                if(target<nums[mid] && target>=nums[left])
                    right = mid-1;
                else
                    left = mid+1;
            }
            else
            {
                if(target>=nums[mid] && target<=nums[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
        }
        return -1;
    }
}
