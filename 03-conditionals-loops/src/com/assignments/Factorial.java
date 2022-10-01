package com.assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        int num=in.nextInt();
        int result=1;
        if(num>=0){
            if(num!=0) {
                for (int count = 1; count <= num; count++) {
                    result *= count;
                }
            }
            System.out.println(num+"! = "+result);
        }
        else{
            System.out.println("Error: -ve numbers does not have factorial");
        }
    }
}
