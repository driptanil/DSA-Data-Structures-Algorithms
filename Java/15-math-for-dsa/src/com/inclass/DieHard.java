package com.inclass;

public class DieHard {
    public static void main(String[] args) {
        int[] arr = new int[] {8, 18};
        int k = 5;
        System.out.println(bucket(arr, k));
    }

    static boolean bucket (int[] arr, int k) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            while (arr[i - 1] % arr[i] != 0) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i - 1] % arr[i];
                arr[i] = temp;
            }
        }
        return (k % arr[arr.length - 1] == 0);
    }
}
