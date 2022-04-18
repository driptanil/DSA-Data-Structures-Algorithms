package com.inclass;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        // start
        int x1 = 1, y1 = 1;
        // end
        int x2 = 3, y2 = 3;
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        recVoid(x1 - x2, y1 - y2, "");
        System.out.println("\n" + recList(x1 - x2, y1 - y2, ""));
    }

    static void recVoid (int x, int y, String str) {
        if (x == 0 && y == 0) {
            System.out.print(str + " ");
            return;
        }
        if (x > 0) {
            recVoid(x - 1, y, str + "N");
        } if (x < 0) {
            recVoid(x + 1, y, str + "S");
        } if (y > 0) {
            recVoid(x, y - 1, str + "W");
        } if (y < 0) {
            recVoid(x, y + 1, str + "E");
        }
    }

    static List<String> recList (int x, int y, String str) {
        List<String> list = new ArrayList<>();
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        }
        if (x > 0) {
            list.addAll(recList(x - 1, y, str + "N"));
        } if (x < 0) {
            list.addAll(recList(x + 1, y, str + "S"));
        } if (y > 0) {
            list.addAll(recList(x, y - 1, str + "W"));
        } if (y < 0) {
            list.addAll(recList(x, y + 1, str + "E"));
        }
        return list;
    }
}
