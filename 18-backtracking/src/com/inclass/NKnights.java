package com.inclass;

import java.util.List;

public class NKnights {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int k = 5;
        boolean[][] board = new boolean[m][n];
        nKnights(board, 0, 0, k);
    }

    static void nKnights (boolean[][] board, int row, int col, int k) {
        if (k == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            nKnights(board, row + 1, 0, k);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col + 1, k - 1);
            board[row][col] = false;
        }

        nKnights(board, row, col + 1, k);
    }

    static void display (boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("K ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe (boolean[][] board, int i, int j) {
        for (int p = 0; p < board.length; p++) {
            for (int q = 0; q < board[p].length; q++) {
                if (board[p][q]) {
                    int a = Math.abs(Math.subtractExact(p, i));
                    int b = Math.abs(Math.subtractExact(q, j));
                    if (a == 2 && b == 1 || a == 1 && b == 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
