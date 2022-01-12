package com.inclass;

public class DigitsSum {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(digitsSum(num, 0));
    }
    static int digitsSum(int num, int sum) {
        int temp = (int) (num / Math.pow(10,(int)(Math.log10(num))));
        if (temp == 0) {
            return sum;
        }
        sum = sum + temp;
        num = (int) (num % Math.pow(10,(int)(Math.log10(num))));
        return digitsSum(num, sum);
    }
}
