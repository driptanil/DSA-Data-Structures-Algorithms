package com.inclass;

public class SingleInDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 4, 2, 1};
        System.out.println(xor(arr));
    }
    static int xor(int[] arr) {
        int xorSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xorSum = xorSum ^ arr[i];
        }
        return xorSum;
    }
}
