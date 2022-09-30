package com.assignments;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Input: ");
        String input=in.next();
        int count=input.length();
        int sum=0;
        int num;
        for (int i=0;i<count;i++) {
            num=(int)(input.charAt(i));
            sum+=num-48;
        }
        System.out.println("Sum: "+sum);
    }
}
