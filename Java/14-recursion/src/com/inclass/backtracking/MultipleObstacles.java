package com.inclass.backtracking;

import java.util.ArrayList;
import java.util.List;

public class MultipleObstacles {
    public static void main(String[] args) {
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        boolean[][] arr = new boolean[][]{
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        // start
        int x1 = 1, y1 = 1;
        // target
        int x2 = 3, y2 = 3;
        System.out.println(recList(arr, x1 - x2, y1 - y2, ""));

        // start
        x1 = 3; y1 = 3;
        // target
        x2 = 1; y2 = 1;
        System.out.println(recList(arr, x1 - x2, y1 -y2, ""));

    }

    static List<String> recList (boolean[][] arr, int x, int y, String str) {
        List<String> list = new ArrayList<>();
        if (Math.abs(x) == 0 && Math.abs(y) == 0) {
            list.add(str);
            return list;
        } if (!arr[Math.abs(x)][Math.abs(y)]) {
            return list;
        } if (x < 0) {
            list.addAll(recList(arr, x + 1, y, str + "E"));
        } if (x > 0) {
            list.addAll(recList(arr, x - 1, y, str + "W"));
        } if (y < 0) {
            list.addAll(recList(arr, x, y + 1, str + "S"));
        } if (y > 0) {
            list.addAll(recList(arr, x, y - 1, str + "N"));
        } return list;
    }
}
