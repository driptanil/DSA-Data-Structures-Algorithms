package com.assignments;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First Number: ");
        int num1=in.nextInt();
        System.out.print("Second Number: ");
        int num2=in.nextInt();
        int lcm;
        int hcf=1;
        int large;
        boolean bool=true;
        if(num1>num2){
            large=num1;
        }
        else{
            large=num2;
        }
        for (int i=2;i<=large;i++) {
            for (int j=2;j<i;j++) {
                if(i%j==0){
                    bool=false;
                }
            }
            if(bool==true){
                int num1_copy=num1;
                int num2_copy=num2;
                while (true) {
                    if (num1_copy % i == 0 && num2_copy % i == 0) {
                        num1_copy/=i;
                        num2_copy/=i;
                        hcf *= i;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        lcm=num1*num2/hcf;
        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
    }
}
