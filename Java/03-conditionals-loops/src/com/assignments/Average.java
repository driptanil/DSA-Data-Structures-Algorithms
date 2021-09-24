package com.assignments;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float sum=0;
        System.out.print("No of inputs: ");
        int count=in.nextInt();
        for (int i = 0; i <count; i++) {
            System.out.print("input :");
            float num=in.nextFloat();
            sum+=num;
        }
        float avg = sum/count;
        System.out.println("Average: "+avg);
    }
}
