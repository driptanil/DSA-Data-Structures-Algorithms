package com.inclass;

import java.util.Scanner;

public class Recursion {
    /*
    RECURSION:
        Rules:
            1. Until the function is executing, the function remains in stack memory.
            2. When the function has finished executing, the function is removed
             from stack memory.

        Definition:
            Recursion is function calling itself.

        Conditions:
            1. A base condition is required for stopping calling another function
             under a function.
            2. If no base condition is added then stack will be filled up and lead
             to "Stack Overflow".

        Why Recursion ?:
            1. It helps us in solving bigger complex problems in a simpler way.
            2. In recursion, space complexity is not constant, because of recursive
             calls.
            3. While problem-solving, first use recursion and then convert to
            iteration.

        How functions are called ?:
            In Stack memory:
                       |  |                     |  ^
                       |  |     [number(end)]   |  |
                       |  |        :   :        |  |
                       |  |        :   :        |  |
                       |  |        :   :        |  |
                       |  |        :   :        |  |
                       |  | [number(start + 2)] |  |
                       |  | [number(start + 1)] |  |
                       v  |       [main]        |  |
                          |_____________________|

        Types of Recerence Relations:
            1. Linear (like Fibonacci)
            2. Divide and Rule (Space reduced by a Factor) (like Binary Search)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        print(1, scan.nextInt());
    }

    static void print(int count, int n) {
        if (count <= n) {
            System.out.print(count + "  ");
            print(count + 1, n);
        }
    }
}
