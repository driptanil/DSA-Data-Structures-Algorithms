package com.inclass;

public class Integer {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 2;
//        System.out.println(linearSearch(nums, target));
//        System.out.println(linearSearch2(nums, target));
//        System.out.println(linearSearch3(nums, target));
//        System.out.println(rangeSearch(nums, target, 1, 5));
        System.out.println(findMin(nums));
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        // no target found
        return -1;
    }

    // search in the array: return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return java.lang.Integer.MAX_VALUE;
        }
        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // not target found
        return java.lang.Integer.MAX_VALUE;
    }

    //search in the array: return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // not target found
        return false;
    }

    // search in array[index1, index2]: return true or false
    static int rangeSearch(int[] arr,int target, int index1, int index2) {
        if (index1 >= index2) {
            return -1;
        }
        for (int i = index1; i < index2; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // find minimum number from an array
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
               min = arr[i];
            }
        }
        return min;
    }
}