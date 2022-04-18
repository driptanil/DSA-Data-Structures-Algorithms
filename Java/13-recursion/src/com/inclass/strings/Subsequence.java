package com.inclass.strings;

import java.util.List;
import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(subsequence("", str));
        int[] arr = {1, 2, 3};
        System.out.println(subset(arr));
        System.out.println(subsetDuplicates(arr));
    }


    static String subsequence(String sub, String str) {
        if (str.length() == 0) {
            return sub + ", ";
        }
        return subsequence(sub + str.charAt(0), str.substring(1)) + subsequence(sub, str.substring(1));
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicates(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            int i = n / 2;
            if (outer.get(n - 1).size() == 0 || outer.get(n - 1).get(outer.get(n - 1).size() - 1) != num) {
                i = 0;
            }
            while(i < n) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
                i++;
            }
        }
        return outer;
    }
}
