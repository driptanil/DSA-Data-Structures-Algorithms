package com.inclass;

import java.util.ArrayList;
import java.util.List;

public class NQueen2 {
    public static void main(String[] args) {
        int n = 5;
        for (List<String> list : solveNQueens(n)) {
            System.out.println(list);
        }
        /*for (List<Integer> list: nQueens(new ArrayList<>(), n, -1, -1)) {
            System.out.println(list);
        }*/
    }


    static List<List<String>> solveNQueens (int n) {
        return converter(nQueens(new ArrayList<>(), n , -1, -1), n);
    }

    static List<List<Integer>> nQueens (List<Integer> board, int n, int i, int j) {
        List<List<Integer>> answers = new ArrayList<>();
        if (i == -1) {
            while (j++ < n - 1 && i < n) {
                answers.addAll(nQueens(board, n, i + 1, j));
            }
            return answers;
        }
        if (!safety(board, i, j)) {
            return new ArrayList<>();
        }
        board.add(j);
        j = -1;
        if (i == n - 1) {
            answers.add(new ArrayList<>(board));
            board.remove(board.size() - 1);
            return answers;
        }
        while (j++ < n - 1 && i < n) {
            answers.addAll(nQueens(board, n, i + 1, j));
        }
        board.remove(board.size() - 1);
        return answers;
    }

    static boolean safety(List<Integer> board, int i, int j) {
        for (int k = 0; k < board.size(); k++) {
            if (Math.abs(Math.subtractExact(i, k)) == Math.abs(Math.subtractExact(j, board.get(k))) || i == k || j == board.get(k)) {
                return false;
            }
        }
        return true;
    }

    static List<List<String>> converter(List<List<Integer>> list, int n) {
        List<List<String>> board = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            board.add(new ArrayList<>());
            for (int j = 0; j < list.get(i).size(); j++) {
                String str = "";
                for (int k = 0; k < list.get(i).get(j); k++) {
                    str += ".";
                }
                str += "Q";
                for (int k = list.get(i).get(j) + 1; k < n; k++) {
                    str += ".";
                }
                board.get(i).add(str);
            }
        }
        return board;
    }
}
