package com.assignments;

import java.util.Scanner;

public class ElectricityBill {
    public static float EnergyCharge(Integer unit,Float cost,Float cat) {
        int temp;
        if (unit>400){
            temp=unit-400;
            cost+=(cat+4)*temp;
            unit-=temp;
        }
        if (unit>300 && unit<=400){
            temp=unit-100;
            cost+=(cat+3)*temp;
            unit-=temp;
        }
        if (unit>200 && unit<=300){
            temp=unit-100;
            cost+=(cat+2)*temp;
            unit-=temp;
        }
        if (unit>100 && unit<=200){
            temp=unit-100;
            cost+=(cat+1)*temp;
            unit-=temp;
        }
        if (unit>=0 && unit<=100){
            temp=unit-100;
            cost+=(cat+3)*temp;
            unit-=temp;
            return cost;
        }
    }

    public static void main(String[] args) {
        float cost=0;
        float domestic=5;
        float commercial=5.5f;
        float industrial=6;
        float agricultural=4;
        boolean bool=true;

        Scanner in =new Scanner(System.in);

        while (true) {
            System.out.print("Unit (int): ");
            int unit = in.nextInt();
            if (unit < 0) {
                System.out.println("Error: Unit is never -ve !");
            }
            else{
                break;
            }
        }
        while(true) {
            System.out.println("Domestic : 'd'");
            System.out.println("Commercial : 'c'");
            System.out.println("Industrial : 'i'");
            System.out.println("Agriculture : 'a'");
            System.out.print("Category of Consumer: ");
            char cat = in.next().charAt(0);
            if (cat == 'd') {
                cost = EnergyCharge(unit, cost, domestic);
                System.out.println("Domestic Cost: "+cost);
                break;
            }
            else if (cat == 'c') {
                cost = EnergyCharge(unit, cost, domestic);
                System.out.println("Commercial Cost: "+cost);
                break;
            }
            else if (cat == 'i') {
                cost = EnergyCharge(unit, cost, domestic);
                System.out.println("Industrial Cost: "+cost);
                break;
            }
            else if (cat == 'a') {
                cost = EnergyCharge(unit, cost, domestic);
                System.out.println("Agricultural Cost: "+cost);
                break;
            }
            else {
                System.out.println("Error: Enter valid input !");
            }
        }

        System.out.print("Contract Demand: ");
        float cd=in.nextFloat();
        System.out.print("Due Date (DD/MM/YYYY): ");
        String due=in.next();
        System.out.print("Payment Date (DD/MM/YYYY): ");
        String pay=in.next();
        System.out.println("E-Payment: 'e'");
        System.out.println("Normal Payment: 'n'");
        System.out.print("\tMode of Payment: ");
        char mode=in.next().charAt(0);

        /* Energy Charge
                Slab (unit):                         1-100   101-200   201-300   301-400     400<
                Domestic Rate (per unit) :           $5      $6        $7        $8          $9
                Commercial Rate (per unit) :         $5.5    $6.5      $7.5      $8.5        $9.5
                Industrial Rate (per unit) :         $6      $7        $8        $9          $10
                Agriculture Rate (per unit) :        $4      $5        $6        $7          $8

            Fixed Charge:
                Contract Demand (kVA):              1-500   500<
                Rate (per kVA):                     $3      $4

            Monthly Variable Cost Adjustment (per unit):     $1.50

            Meter Rent:
                Category:   Domestic    Commercial    Industrial    Agricultural
                Rate:       $30         $40           $50           $60

            Electricity Duty :  @1.5% of energy & fixed charge

            Government Subsidy:     @0.025% of energy charge if energy consumption is <500 units for domestic consumer

            Late Payment Surcharge:     1% per month (<=3 months delay or part thereof)  1.5% ( >3 month )

            Minimum Charge:     Domestic     Commercial
                                   $40          $50

            E-Payment Discount:     0.5% of total charge

         */
    }
}
