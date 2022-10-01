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
        int large,small;
        if(num1>num2){
            large=num1;
            small=num2;
        }
        else{
            large=num2;
            small=num1;
        }
        for (int index = small; index > 0; index--) {
            if (large%index==0 && small%index==0){
                hcf=index;
                break;
            }
        }
        lcm=(int)(num1*num2/hcf);
        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
    }
}
