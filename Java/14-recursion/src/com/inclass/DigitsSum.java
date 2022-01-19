package com.inclass;

public class DigitsSum {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(digitsSum(num));
    }

    static int digitsSum(int num) {
        int temp = (int) (num / Math.pow(10,(int)(Math.log10(num))));
        if (temp == 0) {
            return temp;
        }
        num = (int) (num % Math.pow(10,(int)(Math.log10(num))));
        return temp + digitsSum(num);
    }
}
