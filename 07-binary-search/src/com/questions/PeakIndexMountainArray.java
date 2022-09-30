package com.questions;

public class PeakIndexMountainArray {

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 4, 3, 2, 1};
        System.out.println(selfAttempt(arr));
        System.out.println(solution(arr));
        System.out.println(solution2(arr));
    }

    /* Self Attempt (Error: {1}):
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
    Memory Usage: 39 MB, less than 89.22% of Java online submissions for Peak Index in a Mountain Array.
     */
     static int selfAttempt(int[] arr) {
         int start = 0;
         int end = arr.length - 1;
         while (start <= end) {
             int index = start + (end - start) / 2;
             int temp = index;
             while (true) {
                 if (arr[index] < arr[index + 1]) {
                     start = index + 1;
                     break;
                 }
                 else if(arr[index] > arr[index + 1]) {
                     end = temp - 1;
                     break;
                 }
                 index++;
             }
         }
         return start;
     }

     /* Solution (No Errors):
     Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
     Memory Usage: 43.1 MB, less than 38.42% of Java online submissions for Peak Index in a Mountain Array.
      */
    // coding after understanding the solution
    static int solution(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int index = start + (end - start) / 2;
            int temp = index;
            while (true) {
                if (arr[index] < arr[index + 1]) {
                    start = index + 1;
                    break;
                }
                else if(arr[index] > arr[index + 1]) {
                    end = temp;
                    break;
                }
                index++;
            }
        }
        return start;
    }

    /* Solution2 (Error: {1, 2, 2, 3, 1}:
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
    Memory Usage: 39 MB, less than 89.22% of Java online submissions for Peak Index in a Mountain Array.
     */
    // original solution
    static int solution2 (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
