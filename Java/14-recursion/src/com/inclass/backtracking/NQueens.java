package com.inclass.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        /*
        Runtime: 10 Ms, faster than 31.94% of Java online submissions for N-Queens.
        Memory Usage: 42.6 MB less than 79.66% of Java online submissions for N-Queens.
         */
        for(List<String> lst : answer1(n)) {
            for(String str : lst) {
                System.out.println(str);
            }
            System.out.println();
        }
        /*
        Runtime: 7 ms, faster than 50.15% of Java online submissions for N-Queens.
        Memory Usage: 42.5 MB, less than 80.84% of Java online submissions for N-Queens.
         */
        for(List<String> lst : answer2(n)) {
            for(String str : lst) {
                System.out.println(str);
            }
            System.out.println();
        }
    }


    /*
    Runtime: 10 Ms, faster than 31.94% of Java online submissions for N-Queens.
    Memory Usage: 42.6 MB less than 79.66% of Java online submissions for N-Queens.
     */
    static List<List<String>> answer1(int n) {
        List<List<String>> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            list.addAll(nQueens(n - 1, i, new boolean[n][n], new String[n]));
            i++;
        }
        return list;
    }

    static List<List<String>> nQueens(int n, int i, boolean[][] safety, String[] board) {
        if (safety[n][i]) {
            return new ArrayList<>();
        }
        List<List<String>> list = new ArrayList<>();
        boolean[][] storage = new boolean[safety.length][safety[0].length];
        copy(storage, safety);
        territory(safety, n, i);
        board[n] = print(n, i, safety.length);
        n--;
        i = 0;
        while (i < safety[0].length) {
            if (n < 0) {
                list.add(new ArrayList<>(Arrays.asList(board)));
                return list;
            }
            list.addAll(nQueens(n, i, safety, board));
            i++;
        }
        copy(safety, storage);
        return list;
    }

    static String print(int n, int i, int length) {
        String str = "";
        for (int j = 0; j < i; j++) {
            str += ". ";
        }
        str += "Q ";
        for (int j = i; j < length - 1; ++j) {
            str += ". ";
        }
        return str;
    }

    static void territory(boolean[][] arr, int n, int i) {
        for (int nn = 0; nn < arr.length; nn++) {
            arr[nn][i] = true;
        }
        for (int ii = 0; ii < arr[0].length; ii++) {
            arr[n][ii] = true;
        }
        int nn = n, ii = i;
        arr[n][i] = true;
        while (--nn >= 0 && ++ii < arr[0].length) {
            arr[nn][ii] = true;
        }
        nn = n; ii = i;
        while (--nn >= 0 && ii > 0 && --ii < arr[0].length) {
            arr[nn][ii] = true;
        }
    }

    static void copy(boolean[][] paste, boolean[][] copy) {
        for (int i = 0; i < paste.length; i++) {
            for (int j = 0; j < paste[0].length; j++) {
                paste[i][j] = copy[i][j];
            }
        }
    }

    /*
    Runtime: 7 ms, faster than 50.15% of Java online submissions for N-Queens.
    Memory Usage: 42.5 MB, less than 80.84% of Java online submissions for N-Queens.
     */
    static List<List<String>> answer2(int n) {
        List<int[]> num = new ArrayList<>();
        int i = 0;
        while (i < n) {
            num.addAll(nQueens2(n - 1, i, new int[n]));
            i++;
        }
        return converter(num, n);
    }

    static List<int[]> nQueens2(int n, int i, int[] board) {
        if (!isSafe(n, i, board)) {
            return new ArrayList<>();
        }
        List<int[]> list = new ArrayList<>();
        board[n] = i + 1;
        i = 0;
        n--;
        if (n < 0) {
            list.add(Arrays.copyOf(board, board.length));
            return list;
        }
        while (i < board.length) {
            list.addAll(nQueens2(n, i, board));
            board[n] = 0;
            i++;
        }
        return list;
    }

    static boolean isSafe(int n, int i, int[] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[j] != 0) {
                if (n == j || Math.abs(n - j) == Math.abs(i - board[j] + 1) || i == board[j] - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    static List<List<String>> converter(List<int[]> num, int length) {
        List<List<String>> list = new ArrayList<>(num.size());
        for (int i = 0; i < num.size(); i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < num.get(i).length; j++) {
                int n = num.get(i)[j] - 1;
                String str = "";
                for (int k = 0; k < n; k++) {
                    str += "_ ";
                }
                str += "Q ";
                for (int k = n; k < length - 1; ++k) {
                    str += "_ ";
                }
                list.get(list.size() - 1).add(str);
            }
        }
        return list;
    }
}