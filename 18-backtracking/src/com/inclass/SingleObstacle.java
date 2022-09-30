package com.inclass;

import java.util.ArrayList;
import java.util.List;

public class SingleObstacle {
    public static void main(String[] args) {
        // start
        int x1 = 1, y1 = 1;
        // end
        int x2 = 3, y2 = 3;
        // obstacle
        int xx = 2, yy = 2;
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        singleObstacle(x1, x2, xx, y1, y2, yy);
    }

    static void singleObstacle (int x1 , int x2, int xx , int y1 , int y2 ,int yy) {
        System.out.println(recList(x1 - x2, y1 - y2, xx - x2, yy - y2, ""));
    }

    static List<String> recList(int x, int y, int xx, int yy, String str) {
        List<String> list = new ArrayList<>();
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        } if (x == xx && y == yy) {
            return list;
        }
        if (x > 0) {
            list.addAll(recList(x - 1, y, xx, yy, str + "N"));
        } if (x < 0) {
            list.addAll(recList(x + 1, y, xx, yy, str + "S"));
        } if (y > 0) {
            list.addAll(recList(x, y - 1, xx, yy, str + "W"));
        } if (y < 0) {
            list.addAll(recList(x, y + 1, xx, yy, str + "E"));
        }
        return list;
    }
}
