package com.questions;

// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        System.out.println(bestSolution());
    }

    static int solution() {
        int[] arr = {1, 2, 3, 4, 5};
        int m = 2;
        if (arr.length - 1 == m) {
            return peak(arr);
        } else if (m == 1) {
            return sum(arr);
        }
        return splitArray(arr, m);
    }

    static int splitArray(int[] arr, int m) {
        int maxsum = 0;
        int sum = sum(arr);
        int peak= peak(arr);
        for (int i = 1; i < m; i++) {
            sum = (sum + peak) / 2;
        }
        int tempsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (tempsum + arr[i] < sum) {
                tempsum += arr[i];
            } else {
                if (tempsum > maxsum) {
                    maxsum = tempsum;
                }
                tempsum = arr[i];
            }
        }
        if (tempsum > maxsum) {
            maxsum = tempsum;
        }
        return maxsum;
    }

    static int peak(int[] arr) {
        int peak = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > peak) {
                peak = arr[i];
            }
        }
        return peak;
    }


    /*

     */
     static int bestSolution () {
        int[] arr = {1, 4, 4} ;
        int m = 2;
        return splitArray2(arr, m);
     }

    static int splitArray2(int[] arr,int m) {
        int left = max(arr);// max element
        int right = sum(arr);
        int count = 1;
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] <= mid) {
                    sum += arr[i];
                } else {
                    count++;
                    sum = arr[i];
                    break;
                }
            }
            if (count <= m) {
                right = mid;
                ans = left + (right - left) / 2;
            } else {
                left = mid + 1;
                break;
            }
        }
        return ans;
    }

    static int sum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int max(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (sum < arr[i]){
                sum = arr[i];
            }
        }
        return sum;
    }
}


