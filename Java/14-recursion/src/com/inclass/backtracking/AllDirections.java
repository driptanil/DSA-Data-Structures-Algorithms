package com.inclass.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllDirections {
    public static void main(String[] args) {
        /* N -> North, S -> South, E -> East, W -> West
        Ne -> North-east, Nw -> North-west, Se -> South-east, Sw -> South-west */
        boolean[][] arr = new boolean[][]{
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int x1, y1, x2, y2;

        // start
        x1 = 1; y1 = 1;
        // target
        x2 = 3; y2 = 3;
        System.out.println(recList(arr, x1 - x2, y1 - y2, "", x1 - x2 > 0 , y1 - y2 > 0));

        // start
        x1 = 1; y1 = 3;
        // target
        x2 = 3; y2 = 1;
        System.out.println(recList(arr, x1 - x2, y1 - y2, "", x1 - x2 > 0, y1 - y2 > 0));

        // start
        x1 = 3; y1 = 1;
        // target
        x2 = 1; y2 = 3;
        System.out.println(recList(arr, x1 - x2, y1 - y2, "", x1 - x2 > 0, y1 - y2 > 0));

        // start
        x1 = 3; y1 = 3;
        // target
        x2 = 1; y2 = 1;
        System.out.println(recList(arr, x1 - x2, y1 - y2, "", x1 - x2 > 0, y1 - y2 > 0));

    }

    static List<String> recList (boolean[][] arr, int x, int y, String str, boolean bool1, boolean bool2) {
        List<String> list = new ArrayList<>(0);
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        } if (!bool1) {
            if (!bool2) {
                if (-x < 0 || -x >= arr.length || -y < 0 || -y >= arr[0].length || !arr[arr[0].length + y - 1][arr.length + x - 1]) {
                    return list;
                }
                arr[arr[0].length + y - 1][arr.length + x - 1] = false;
                list.addAll(recList(arr, x + 1, y, str + "E", bool1, bool2));
                list.addAll(recList(arr, x - 1, y, str + "W", bool1, bool2));
                list.addAll(recList(arr, x, y + 1, str + "S", bool1, bool2));
                list.addAll(recList(arr, x, y - 1, str + "N", bool1, bool2));
                arr[arr[0].length + y - 1][arr.length + x - 1] = true;
            } if (bool2) {
                if (-x < 0 || -x >= arr.length ||  y < 0 || y >= arr[0].length || !arr[y][arr.length + x - 1]) {
                    return list;
                }
                arr[y][arr.length + x - 1] = false;
                list.addAll(recList(arr, x + 1, y, str + "E", bool1, bool2));
                list.addAll(recList(arr, x - 1, y, str + "W", bool1, bool2));
                list.addAll(recList(arr, x, y + 1, str + "S", bool1, bool2));
                list.addAll(recList(arr, x, y - 1, str + "N", bool1, bool2));
                arr[y][arr.length + x - 1] = true;
            }
        } if (bool1) {
            if (!bool2) {
                if (x < 0 || x >= arr.length || -y < 0 || -y >= arr[0].length || !arr[arr[0].length + y - 1][x]) {
                    return list;
                }
                arr[arr[0].length + y - 1][x] = false;
                list.addAll(recList(arr, x + 1, y, str + "E", bool1, bool2));
                list.addAll(recList(arr, x - 1, y, str + "W", bool1, bool2));
                list.addAll(recList(arr, x, y + 1, str + "S", bool1, bool2));
                list.addAll(recList(arr, x, y - 1, str + "N", bool1, bool2));
                arr[arr[0].length + y - 1][x] = true;
            } if (bool2) {
                if (x < 0 || x >= arr.length ||  y < 0 || y >= arr[0].length || !arr[y][x]) {
                    return list;
                }
                arr[y][x] = false;
                list.addAll(recList(arr, x + 1, y, str + "E", bool1, bool2));
                list.addAll(recList(arr, x - 1, y, str + "W", bool1, bool2));
                list.addAll(recList(arr, x, y + 1, str + "S", bool1, bool2));
                list.addAll(recList(arr, x, y - 1, str + "N", bool1, bool2));
                arr[y][x] = true;
            }
        }
        return list;
    }

    static List<String> recList1 (boolean[][] arr, int x, int y, String str) {
        List<String> list = new ArrayList<>(0);
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        }
        if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length || !arr[x][y]) {
            return list;
        }
        arr[x][y] = false;
        list.addAll(recList1(arr, x + 1, y, str + "E"));
        list.addAll(recList1(arr, x - 1, y, str + "W"));
        list.addAll(recList1(arr, x, y + 1, str + "S"));
        list.addAll(recList1(arr, x, y - 1, str + "N"));
        arr[x][y] = true;
        return list;
    }

    static List<String> recList2(boolean[][] arr, int x, int y, String str) {
        List<String> list = new ArrayList<>();
        if (x == 0 && y == 0) {
            list.add(str);
            return list;
        }

        if (!arr[Math.abs(x)][Math.abs(y)]) {
            return list;
        }
        arr[Math.abs(x)][Math.abs(y)] = false;
        if (x < 0) {
            list.addAll(recList2(arr, x + 1, y, str + "E"));
        } if (x > 0) {
            list.addAll(recList2(arr, x - 1, y, str + "W"));
        } if (y < 0) {
            list.addAll(recList2(arr, x, y + 1, str + "S"));
        } if (y > 0) {
            list.addAll(recList2(arr, x, y - 1, str + "N"));
        }
        arr[Math.abs(x)][Math.abs(y)] = true;
        return list;
    }
}
