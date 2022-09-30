package com.questions;

import java.lang.Math;

public class IndexInfiniteArray {

    public static void main(String[] args) {
        System.out.println(solution());
    }

    static int solution() {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i;
        }
        int target = 13;
        return findRange(nums, target);
    }

    static double log2(int num) {
        return Math.log(num)/Math.log(2);
    }

    static int findRange(int[] nums, int target) {
        int start = 0;
        int end = 0;
        int range = (int) log2(nums.length);
        while(start <= end) {
            while (range >= 0) {
                if ((nums.length - start + 1) - Math.pow(2, range) >= 0) {
                    end = start + (int) Math.pow(2, range) - 1;
                    range--;
                    break;
                }
                range--;
            }
            if (target == nums[end]){
                return end;
            } else if (target < nums[end]){
                return binarySearch(nums, target, start, end - 1);
            } else {
                start = end + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int tempstart, int tempend) {
        while (tempstart <= tempend) {
            int index = tempstart + (tempend - tempstart) / 2;
            if (target < nums[index]) {
                tempend = index - 1;
            }
            else if (target > nums[index]) {
                tempstart = index + 1;
            }
            else {
                return index;
            }
        }
        return -1;
    }
}
