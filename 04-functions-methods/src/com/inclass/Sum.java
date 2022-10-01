package com.inclass;

import java.util.Scanner;

public class Sum {
    // NON RETURN TYPE
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Sum: "+sum);
//    }

    // RETURN TYPE
//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("First Number: ");
//        int num1 = in.nextInt();
//        System.out.print("Second Number: ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum;
//    }

    static int sum3(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        //NON RETURN TYPE
//        sum();

        //RETURN TYPE
        int ans = sum3(2,3);
        System.out.print("Sum: "+ans);
    }
}
