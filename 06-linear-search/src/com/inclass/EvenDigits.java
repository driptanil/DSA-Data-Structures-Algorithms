package com.inclass;

import java.util.ArrayList;
import java.util.List;

public class EvenDigits {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        List<Integer> evenDigits = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (digits2(arr[i]) % 2 == 0) {
                System.out.print(arr[i]+" ");;
            }
        }
    }

    // loop true
    static int digits1(int num) {
        int count = 0;
        if (num == 0) {
            return -1;
        }
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // using log10 to find the numbers of digits
    static int digits2(int num) {
        return (int)(Math.log10(num))+1;
    }
}
