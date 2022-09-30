package com.questions;

public class TargetRotatedSortedArray {

    // https://leetcode.com/problems/search-in-rotated-sorted-array/

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        System.out.println(selfAttempt(arr, target));
        System.out.println(solution(arr, target));
        System.out.println(bestSolution(arr, target));
        System.out.println(search(arr, target));
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
        } else {
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
            } else if (arr[index] == arr[start] && arr[index] == arr[end]) {
                start ++;
                end --;
            } else if (arr[index] <= arr[start]) {
                end = index - 1;
            } else if (arr[index] >= arr[end]) {
                start = index + 1;
            } else if (arr[start] == arr[end]) {
                start ++;
                end --;
            }
        }
        return -1;
    }


    /* Best Solution (no need to find peak, works with duplicates) :
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
    Memory Usage: 39.2 MB, less than 42.77% of Java online submissions for Search in Rotated Sorted Array.
     */
    static int bestSolution (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)  / 2;
            if (arr[mid] == target) {
                return target;
            } else if (arr[start] > target) {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotKunal(nums);
        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }
        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // this will not work in duplicate values
    static int findPivotKunal(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

