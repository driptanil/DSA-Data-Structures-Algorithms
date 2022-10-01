package com.inclass;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
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

/*
         *
        * *
       *   *
      *     *
     *********
 */
    static void pattern13 (int n) {
        for (int i = 1; i <= n; i++) {
            int temp;
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i == n) {
                for (int j = 1; j < n * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else {
                if (i != 1) {
                    for (int j = 1; j < (i - 1) * 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    /*
         *******
          *   *
           * *
            *
     */
    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i == 1) {
                for (int j = 1; j < n * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else if (i < n) {
                for (int j = i * 2; j <= (n - 1) * 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
            *
           * *
          *   *
         *     *
          *   *
           * *
            *
     */
    static void pattern15(int n) {
        for (int i = 1; i < n * 2; i++) {
            int temp = i < n ? i : n * 2 - i;
            for (int j = 1; j <= n - temp; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1 && i < n * 2 - 1) {
                for (int j = 1; j < (temp - 1) * 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
     */
    static void pattern16(int n) {
        for (int i =  1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            int temp = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp = temp * (i - j) / j;
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    /*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
      4 3 2 1 2 3 4
        3 2 1 2 3
          2 1 2
            1
     */
    static void pattern17 (int n) {
        for (int i = 1; i < n * 2; i++) {
            int temp = i < n ? i : n * 2 - i;
            for (int j = temp; j < n; j++) {
                System.out.print("  ");
            }
            int temp1 = temp + 1;
            for (int j = 1; j < temp * 2; j++) {
                temp1 = j <= temp ? temp1 - 1 : temp1 + 1;
                System.out.print(temp1 + " ");
            }
            System.out.println();
        }
    }

    /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         **      **
         ***    ***
         ****  ****
         **********
     */
    static void pattern18 (int n) {
        for (int i = 1; i < n * 2; i++) {
            int temp = i < n ? i : n * 2 - i;
            for (int j = temp; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < temp * 2 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = temp; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *
     */
    static void pattern19 (int n) {
        for (int i = 1; i < n * 2; i++) {
            int temp = i < n ? i : n * 2 - i;
            for (int j = 1; j <= temp; j++) {
                System.out.print("*");
            }
            for (int j = temp; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= temp; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
         *****
         *   *
         *   *
         *   *
         *****
     */
    static void pattern20 (int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.println("*****");
            } else {
                System.out.println("*   *");
            }
        }
    }

    /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
     */
    static void pattern21 (int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
