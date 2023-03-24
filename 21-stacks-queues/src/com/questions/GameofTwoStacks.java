package com.questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Game of Two Stacks
 * <a href="https://www.hackerrank.com/challenges/game-of-two-stacks/problem">...</a>
 */
public class GameofTwoStacks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        no of games = g
        int g = input.nextInt();
        for (int i = 0; i < g; i++) {
//          size of first stack = m
            int m = input.nextInt();
//          size of second stack = n
            int n = input.nextInt();
            int maxSum = input.nextInt();

            Queue<Integer> a = new LinkedList<Integer>();
            Queue<Integer> b = new LinkedList<Integer>();

            for (int j = 0; j < m; j++) {
                a.add(input.nextInt());
            }

            for(int j = 0; j < n; j++) {
                b.add(input.nextInt());
            }

            System.out.println(findCount(m, a, n, b, maxSum));
        }


    }

    static int findCount (int m, Queue<Integer> a, int n, Queue<Integer> b, int maxSum) {
        int sum = 0;
        int count = 0;
        while (sum < maxSum && !a.isEmpty() && !b.isEmpty()) {
            if (a.peek() < b.peek()) {
                sum += a.remove();
            } else {
                sum += b.remove();
            }
            count++;
        }

        return count - 1;
    }

}
