package com.assignments;

import java.util.Scanner;

public class DistancePoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1: ");
        int x1= in.nextInt();
        System.out.print("y1: ");
        int y1= in.nextInt();
        System.out.print("x2: ");
        int x2= in.nextInt();
        System.out.print("y2: ");
        int y2= in.nextInt();
        double distance=Math.pow(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)),1/2);
        System.out.println("Distance: "+distance);
    }
}
