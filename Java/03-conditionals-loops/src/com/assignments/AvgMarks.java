package com.assignments;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("No of Subjects: ");
        int count= in.nextInt();
        int subject;
        int sum=0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Obtained Marks (subject"+i+"): ");
            subject=in.nextInt();
            sum+=subject;
        }
        float avg=sum/count;
        System.out.println("Average Marks: "+avg);
    }
}
