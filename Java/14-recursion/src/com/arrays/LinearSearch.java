package com.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 4, 5};
        int target = 4;
        System.out.println(linearSearch(arr, target , 0));
        System.out.println(multipleOccurrences(arr, target, 0));
        System.out.println(returnArrayList(arr, target, 0));
    }

    static boolean linearSearch(int[] arr, int target, int count) {
        if (count >= arr.length) {
            return false;
        }
        return target == arr[count] || linearSearch(arr, target, count + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>(0);

    static ArrayList<Integer> multipleOccurrences (int[] arr, int target, int count) {
        if (count >= arr.length) {
            return list;
        }
        if (arr[count] == target) {
            list.add(count);
        }
        return multipleOccurrences(arr, target, count + 1);
    }

    static ArrayList<Integer> returnArrayList (int[] arr, int target, int count) {
        ArrayList<Integer> list = new ArrayList<>(1);
        if (arr[count] == target) {
            list.add(count);
        }
        if (count == arr.length - 1) {
            return list;
        }
        list.addAll(returnArrayList(arr, target, count + 1));
        return list;
    }
}
