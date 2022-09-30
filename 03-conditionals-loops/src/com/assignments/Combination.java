package com.assignments;

import java.util.Scanner;

public class Combination {
    public static int factorial(Integer num){
        int result=1;
        if(num!=0) {
            for (int count = 1; count <= num; count++) {
                result *= count;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Permutation & Combination");
        System.out.print("p,c: ");
        char input = in.next().charAt(0);
        System.out.print("n: ");
        int n=in.nextInt();
        System.out.print("r: ");
        int r=in.nextInt();
        int sum=factorial(n);
        int total=1;
        total*=sum;
        int temp=n-r;
        sum=factorial(temp);
        total/=sum;
        if(input=='c') {
            sum = factorial(r);
            total /= sum;
            System.out.println("\n"+n);
            System.out.println(" C   = " + total);
            System.out.println("  " + r);
        }
        else if(input=='p'){
            System.out.println(n);
            System.out.println(" P   = " + total);
            System.out.println("  " + r);
        }
        else{
            System.out.println("Wrong Input!");
        }
    }
}
