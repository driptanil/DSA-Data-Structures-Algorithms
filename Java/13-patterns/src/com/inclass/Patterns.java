package com.inclass;

public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        pattern13(n);
    }
/*
     * * * *
     * * * *
     * * * *
     * * * *
 */
    static void pattern1 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
/*
     *
     * *
     * * *
     * * * *
 */
    static void pattern2 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
     * * * *
     * * *
     * *
     *
 */
    static void pattern3 (int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
    1
    1 2
    1 2 3
    1 2 3 4
 */
    static void pattern4 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
/*
     *
     * *
     * * *
     * * * *
     * * *
     * *
     *
 */
    static void pattern5 (int n) {
        int count = 0;
        for (int i = 1; i < n * 2; i++) {
            int temp = i > n ? n * 2 - i : i;
            for (int j = 0; j < temp; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
     *
     * *
     * * *
     * * * *
 */
    static void pattern6 (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
     * * * *
     * * *
     * *
     *
 */
    static void pattern7 (int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
/*
           *
         * * *
       * * * * *
     * * * * * * *
 */
    static void pattern8 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
     * * * * * * *
       * * * * *
         * * *
           *
 */
    static void pattern9 (int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
        *
       * *
      * * *
     * * * *
 */
    static void pattern10 (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
     * * * *
      * * *
       * *
        *
 */
    static void pattern11 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
    * * * *
     * * *
      * *
       *
      * *
     * * *
    * * * *
 */
    static void pattern12 (int n) {
        for (int i = 1; i < n * 2; i++) {
            int temp = i > n ? n * 2 - i : i;
            for (int j = 1; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = temp; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13 (int n) {
        for (int i = 1; i <= n; i++) {
            int temp = i == n ? n * 2 : 2;

        }
    }
}
