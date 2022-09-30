package com.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ElectricityBill {

    static float cost=0f;
    int temp=0;
    static boolean energycharge(int unit, char c) {
        float domestic=5f;
        float commercial=5.5f;
        float industrial=6f;
        float agricultural=4f;
        float cat;
        switch (c) {
            case 'd' -> cat = domestic;
            case 'i' -> cat = industrial;
            case 'a' -> cat = agricultural;
            case 'c' -> cat = commercial;
            default -> {
                System.out.println("Error: Invalid input !");
                return false;
            }
        }
        int temp;
        float rate;
        System.out.print("\t");
        if (unit>400){
            temp=unit-400;
            rate=cat+4;
            cost+=(rate)*temp;
            unit-=temp;
            System.out.print(temp+" * ₹"+rate+" + ");
        }
        if (unit>300 && unit<=400){
            temp=unit-300;
            rate=cat+3;
            cost+=(rate)*temp;
            unit-=temp;
            System.out.print(temp+" * ₹"+rate+" + ");
        }
        if (unit>200 && unit<=300){
            temp=unit-200;
            rate=cat+2;
            cost+=(rate)*temp;
            unit-=temp;
            System.out.print(temp+" * ₹"+rate+" + ");
        }
        if (unit>100 && unit<=200){
            temp=unit-100;
            rate=cat+1;
            cost+=(rate)*temp;
            unit-=temp;
            System.out.print(temp+" * ₹"+rate+" + ");
        }
        if (unit>=0 && unit<=100){
            temp=unit;
            rate=cat;
            cost+=(rate)*temp;
            unit-=temp;
            System.out.println(temp+" * ₹"+rate+" = ₹"+cost);
        }
        return true;
    }

    static void contractdemand(float cd){
        int rate;
        float temp=cd;
        if (cd>500){
            rate=4;
            temp=cd-500;
            cost+=temp*rate;
            cd-=temp;
            System.out.print("\t"+temp+" * ₹"+rate+" + ");
        }
        if (cd<=500){
            rate=3;
            temp=cd;
            cost+=temp*rate;
            cd-=temp;
            System.out.println(temp+" * ₹"+rate+" = ₹"+cost);
        }
    }

    static void mvca(int unit){
        float rate=1.5f;
        System.out.println("\nMonthly Variable Cost Adjustment ("+rate+" per unit):");
        float temp=cost;
        cost += unit * rate;
        System.out.println("\t₹"+temp+" + "+unit+" * ₹"+rate+" = ₹"+cost);
    }

    static void subsidy(){
        float temp = cost;
        double save =cost*0.25/100;
        cost-= save;
        System.out.println("\nSubsidy (0.25%): ");
        System.out.println("\t₹"+temp+" - ₹"+save+" = ₹"+cost);
    }

    static void meterrent(char c){
        float domestic=40f;
        float commercial=50f;
        float industrial=60f;
        float agricultural=30f;
        float cat=0f;
        switch (c) {
            case 'd' -> {
                cat = domestic;
                System.out.println("\nMeter Rent (Domestic):");
            }
            case 'i' -> {
                cat = industrial;
                System.out.println("\nMeter Rent (Industrial):");
            }
            case 'a' -> {
                cat = agricultural;
                System.out.println("\nMeter Rent (Agricultural):");
            }
            case 'c' -> {
                cat = commercial;
                System.out.println("\nMeter Rent (Commercial):");
            }
        }
        float temp = cost;
        cost += cat;
        System.out.println("\t₹"+temp+" + ₹"+cat+" = ₹"+cost);
    }

    static int[] date(String str){
        String[] array;
        array = str.split("/");
        int temp;
        int day=0,month=0,year=0;
        for (int i = 0; i < array.length; i++) {
            temp=0;
            for (int j = 0; j < array[i].length(); j++) {
                temp=temp*10 + ((int) array[i].charAt(j))-48;
            }
            switch (i){
                case 0-> day = temp;
                case 1-> month = temp;
                case 2-> year =temp;
            }
        }
        int[] temp1 ={day,month,year};
        return temp1;
    }

    static boolean leapyear(int year){
        if (year%4==0){
            if (year%100==0){
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    static int daysofmonth(int[] date) {
        int temp=0;
        switch (date[1]){
            case 1,3,5,7,8,10,12 -> temp = 31;
            case 4,6,9,11 -> temp = 30;
            case 2 -> {
                if (leapyear(date[2])){
                    temp = 29;
                }
                else{
                    temp = 28;
                }
            }
        }
        return temp;
    }

    static int[] days(int[] datedue, int[] datepay, int month, int temp){
        int day;
        if (datedue[0]>datepay[0]){
            month-=1;
            day=temp - datedue[0] + datepay[0];
        }
        else{
            day=datepay[0]-datedue[0];
        }
        return new int[]{day, month};
    }

    static void fine(int[] delay){
        int totalmonths = delay[1]+delay[2]*12;
        int count = (int) totalmonths/3;
        float temp=cost,fine,totalfine=0;
        for (int i = 1; i <= count; i++) {
            cost+=cost*i/100;
        }
        fine = cost - temp;
        totalfine+=fine;
        System.out.println("\tFine (per 3 months): ");
        System.out.println("\t\t₹"+temp+" + ₹"+fine+" = ₹"+cost);

        temp=cost;
        cost+=cost*count/3/100*totalmonths%3;
        fine = cost - temp;
        totalfine+=fine;
        System.out.println("\tFine (per month): ");
        System.out.println("\t\t₹"+temp+" + ₹"+fine+" = ₹"+cost);

        int totalweeks = (int) delay[0]/7;
        temp=cost;
        cost+=cost*count/15/100*totalweeks;
        fine = cost - temp;
        totalfine+=fine;
        System.out.println("\tFine (per week): ");
        System.out.println("\t\t₹"+temp+" + ₹"+fine+" = ₹"+cost);
        System.out.println("Total Fine: ₹"+totalfine);
    }

    static void late(int[] datedue,int[] datepay, int temp){
        int day,month,year;
        year= datepay[2] - datedue[2];
        if (datedue[1]>datepay[1]) {
            year-=1;
            month= 12 - datedue[1] + datepay[1];
            day = days(datedue,datepay,month,temp)[0];
            month = days(datedue,datepay,month,temp)[1];
        }
        else{
            month= datepay[1]-datedue[1];
            day = days(datedue,datepay,month,temp)[0];
            month = days(datedue,datepay,month,temp)[1];
        }
        int[] delay = { day, month, year};
        System.out.println("\nPayment Delay:");
        System.out.println("\tDays: "+day+" ; Months: "+month+" ; Years: "+year);
        System.out.println("Late Payment Surcharge:");
        fine(delay);
    }

    static boolean modeofpay(char mode){
        float temp = cost;
        if (mode=='e'){
            cost-=cost*0.5/100;
            float discount = temp - cost;
            System.out.println("\tE-Payment Discount (0.5%): ");
            System.out.println("\t\t₹"+temp+" - ₹"+discount+" = ₹"+cost);
            return true;
        }
        else if (mode=='n') {
            System.out.println("\tNormal Payment (no discount):");
            System.out.println("\t\t₹"+temp+" - ₹0 = ₹"+cost);
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int unit;
        Scanner in =new Scanner(System.in);

        while (true) {
            System.out.print("Opening Meter Reading (int): ");
            int o_unit = in.nextInt();
            System.out.print("Closing Meter Reading (int): ");
            int c_unit = in.nextInt();
            if (o_unit < 0 && c_unit < 0) {
                System.out.println("Error: Meter Reading is never -ve !");
            }
            else if(c_unit<o_unit){
                System.out.println("Error: Closing > Opening Meter Reading !");
            }
            else{
                unit=c_unit-o_unit;
                break;
            }
        }

        char cat;
        while(true) {
            System.out.println("Domestic : 'd'");
            System.out.println("Commercial : 'c'");
            System.out.println("Industrial : 'i'");
            System.out.println("Agriculture : 'a'");
            System.out.print("Category of Consumer: ");
            cat = in.next().charAt(0);
            boolean bool = energycharge(unit,cat);
            if (bool=true){
                break;
            }
        }

        meterrent(cat);
        mvca(unit);

        while (true) {
            System.out.print("\nContract Demand: ");
            float cd = in.nextFloat();
            if (cd>=0){
                contractdemand(cd);
                break;
            }
            else {
                System.out.println("Error: Contract Demand is +ve !");
            }
        }

        subsidy();
        while (true) {
            System.out.println("\nE-Payment: 'e'");
            System.out.println("Normal Payment: 'n'");
            System.out.print("\tMode of Payment: ");
            char mode = in.next().charAt(0);
            if (modeofpay(mode)){
                break;
            }
        }
        int temp;
        int[] datedue;
        while (true) {
            System.out.print("\nDue Date (DD/MM/YYYY): ");
            String due = in.next();
            datedue = date(due);
            temp = daysofmonth(datedue);
            if (datedue[0] >= 0 && datedue[1] >= 0 && datedue[2] >= 0){
                if (datedue[0] <= temp && datedue[1] <= 12) {
                    break;
                }
                else{
                    System.out.print("Error: Invalid Date !!");
                }
            }
            else{
                System.out.print("Error: Invalid Date !!");
            }
        }
        int[] datepay;
        while (true) {
            System.out.print("\nPayment Date (DD/MM/YYYY): ");
            String pay = in.next();
            datepay = date(pay);
            int temp1 = daysofmonth(datepay);
            if (datepay[0] >= 0 && datepay[1] >= 0 && datepay[2] >= 0){
                if (datepay[0] <= temp1 && datepay[1] <= 12) {
                    late(datedue, datepay,temp);
                    break;
                }
                else{
                    System.out.print("Error: Invalid Date !!");
                }
            }
            else{
                System.out.print("Error: Invalid Date !!");
            }
            System.out.println("\nTotal Payment: ₹"+cost);
        }


        /* Energy Charge
                Slab (unit):                         1-100   101-200   201-300   301-400     400<
                Domestic Rate (per unit) :           ₹5      ₹6        ₹7        ₹8          ₹9
                Commercial Rate (per unit) :         ₹5.5    ₹6.5      ₹7.5      ₹8.5        ₹9.5
                Industrial Rate (per unit) :         ₹6      ₹7        ₹8        ₹9          ₹10
                Agriculture Rate (per unit) :        ₹4      ₹5        ₹6        ₹7          ₹8

            Fixed Charge:
                Contract Demand (kVA):              1-500   500<
                Rate (per kVA):                     ₹3      ₹4

            Monthly Variable Cost Adjustment (per unit):     ₹1.50

            Meter Rent:
                Category:   Domestic    Commercial    Industrial    Agricultural
                Rate:       ₹40         ₹50           ₹60           ₹30

            Electricity Duty :  @1.5% of energy & fixed charge

            Government Subsidy:     @0.025% of energy charge if energy consumption is <500 units for domestic consumer

            Late Payment Surcharge:     1% increase per 3 months , 0.33% per month , 0.066% per week

            Minimum Charge:     Domestic     Commercial
                                   ₹40          ₹50

            E-Payment Discount:     0.5% of total charge

         */
    }
}
