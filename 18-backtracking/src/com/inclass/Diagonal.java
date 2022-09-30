package com.inclass;

import java.util.ArrayList;
import java.util.List;

public class Diagonal {
    public static void main(String[] args) {
        // start
        int x1 = 1, y1 = 1;
        // end
        int x2 = 3, y2 = 3;
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        diagonal(x1, x2, y1, y2);
    }

    static void diagonal (int x1, int x2, int y1, int y2) {
        System.out.println(recList(x1 - x2, y1 - y2, ""));
    }

    static List<String> recList (int x, int y, String str) {
        List<String> list = new ArrayList<>();
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        }

        if (x > 0) {
            list.addAll(recList(x - 1, y, str + "N"));
            if (y < 0) {
                list.addAll(recList(x - 1, y + 1, str + "Ne"));
            } if (y > 0) {
                list.addAll(recList(x - 1, y - 1, str + "Nw"));
            }
        } if (y < 0) {
            list.addAll(recList(x, y + 1, str + "E"));
        }

        if (x < 0) {
            list.addAll(recList(x + 1, y, str + "S"));
            if (y > 0) {
                list.addAll(recList(x + 1, y - 1, str + "Sw"));
            } if (y < 0) {
                list.addAll(recList(x + 1, y + 1, str + "Se"));
            }
        } if (y > 0) {
            list.addAll(recList(x, y - 1, str + "W"));
        }

        return list;
    }
}
