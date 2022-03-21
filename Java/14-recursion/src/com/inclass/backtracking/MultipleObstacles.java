package com.inclass.backtracking;

import java.util.ArrayList;
import java.util.List;

public class MultipleObstacles {
    public static void main(String[] args) {
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        boolean[][] arr = new boolean[][]{
                {true, true, true},
                {true, true, false},
                {true, true, true}
        };
        int x1, y1, x2, y2;

        // start
        x1 = 1; y1 = 1;
        // target
        x2 = 3; y2 = 3;
        System.out.println(recList(arr, x1 - x2, y1 - y2, "", x1 - x2 > 0));

        // start
        x1 = 3; y1 = 3;
        // target
        x2 = 1; y2 = 1;
        System.out.println(recList(arr, x1 - x2, y1 -y2, "", x1 - x2 > 0));

        // start
        x1 = 3; y1 = 1;
        // target
        x2 = 1; y2 = 3;
        System.out.println(recList(arr, x1 - x2, y1 -y2, "", x1 - x2 > 0));

        // start
        x1 = 1; y1 = 3;
        // target
        x2 = 3; y2 = 1;
        System.out.println(recList(arr, x1 - x2, y1 -y2, "", x1 - x2 > 0));

    }

    static List<String> recList (boolean[][] arr, int x, int y, String str, Boolean bool) {
        List<String> list = new ArrayList<>();
        if (Math.abs(x) == 0 && Math.abs(y) == 0) {
            list.add(str);
            return list;
        }

        if (!bool) {
            if (y < 0) {
                if (!arr[arr.length + y - 1][arr.length + x - 1]){
                    return list;
                }
                list.addAll(recList(arr, x, y + 1, str + "S", bool));
            } if (y > 0) {
                if (!arr[y][arr.length + x - 1]) {
                    return list;
                }
                list.addAll(recList(arr, x, y - 1, str + "N", bool));
            } if (x != 0) {
                list.addAll(recList(arr, x + 1, y, str + "E", bool));
            }
        }

        if (bool) {
            if (y < 0) {
                if (!arr[arr.length + y - 1][x]){
                    return list;
                }
                list.addAll(recList(arr, x, y + 1, str + "S", bool));
            } if (y > 0) {
                if (!arr[y][x]) {
                    return list;
                }
                list.addAll(recList(arr, x, y - 1, str + "N", bool));
            } if (x != 0) {
                list.addAll(recList(arr, x - 1, y, str + "W", bool));
            }
        }
        return list;
    }
}
