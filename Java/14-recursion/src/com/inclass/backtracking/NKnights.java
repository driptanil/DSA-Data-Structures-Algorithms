package com.inclass.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NKnights {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int k = 5;
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(1).add(2);
        System.out.println(isSafe(2, 2, list));
    }

    /* static List<List<String>> answer(int m, int n, int k) {

    }

    static List<List<List<Integer>>> nKnights(int i, int k, int m, int n, List<List<Integer>> list) {
        if (isSafe(m, n, i, list)) {

        }
            while (i < m) {
            nKnights(i, k, m, n, list);
            i++;
        }
    } */

    static boolean isSafe(int m, int n, int i, List<List<Integer>> list) {
        for (int j = 0; j < list.size(); j++) {
            for (int k = 0; k < list.get(j).size(); k++) {
                if ()
            }
        }
        return true;
    }

}
