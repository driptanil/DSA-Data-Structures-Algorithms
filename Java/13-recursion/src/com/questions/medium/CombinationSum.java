package com.questions.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(arr, target));
    }

    static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        if (target < 0) {
            list.remove(list.size() - 1);
        } if (target == 0) {
            return list;
        }
        for (int i = 0; i < arr.length; i++) {
            list.addAll(combinationSum(arr, target - arr[i]));
        }
        return list;
    }
}
