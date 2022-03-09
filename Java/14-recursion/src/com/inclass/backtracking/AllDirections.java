package com.inclass.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllDirections {
    public static void main (String[] args) {
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        boolean[][] arr = new boolean[][]{
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        // start
        int x1 = 1, y1 = 1;
        // target
        int x2 = 3, y2 = 3;
        System.out.println(recList(arr, x1 - x2, y1 - y2, ""));
    }

    static List<String> recList (boolean[][] arr, int x, int y, String str) {
        List<String> list = new ArrayList<>();
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        }
        int tempx = x;
        if (x < 0) {
            tempx = x + arr.length - 1;
        }
        int tempy = y;
        if (y < 0) {
            tempy = y + arr[0].length - 1;
        }
        if (Math.abs(x) >= arr.length || Math.abs(y) >= arr[0].length || !arr[tempx][tempy]) {
            return list;
        }
        arr[tempx][tempy] = false;
        list.addAll(recList(arr, x + 1, y, str + "E"));
        list.addAll(recList(arr, x - 1, y, str + "W"));
        list.addAll(recList(arr, x, y + 1, str + "S"));
        list.addAll(recList(arr, x, y - 1, str + "N"));
        return list;
    }
}
