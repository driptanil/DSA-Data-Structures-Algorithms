package com.inclass;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(precision(n, (double)root(n)));
    }

    static int root (int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (n / (mid + 1) == mid + 1) {
                return mid + 1;
            } else if (n / (mid + 1) > mid + 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + (end - start) / 2 + 1;
    }

    static double precision (int n, double sol) {
        float decimal = 0.1f;
        int count = 0;
        while (count < 6) {
            int start = 0;
            int end = 9;
            double temp = 0;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                temp = sol + decimal * mid;
                if (n / temp == temp) {
                    return temp;
                } else if (n / temp > temp) {
                    if (n / (temp + decimal) < temp) {
                        decimal *= 0.1;
                        sol = temp;
                        break;
                    }
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            count += 1;
        }
        return sol;
    }
}
