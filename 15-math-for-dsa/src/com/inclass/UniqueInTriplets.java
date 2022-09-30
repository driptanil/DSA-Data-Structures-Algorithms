package com.inclass;

import java.util.Arrays;

public class UniqueInTriplets {
    public static void main(String[] args) {
        int[] arr = {10, 2, 2, 2, 2};
        System.out.println(countSetBit(arr, 4));
    }

    static int countSetBit(int[] arr, int count) {
        int[] setBit = new int[8];
        for (int i = 0; i < setBit.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & (1 << i)) == (1 << i)) {
                    temp += 1;
                }
            }
            setBit[7 - i] = temp % count;
        }
        System.out.println(Arrays.toString(setBit));
        int result = 0;
        for (int i = 0; i < setBit.length; i++) {
            result += setBit[7 - i] << i;
        }
        return result;
    }
}
