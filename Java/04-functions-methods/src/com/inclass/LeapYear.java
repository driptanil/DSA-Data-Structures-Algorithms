package com.inclass;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear2(8));
        System.out.println(isLeapYear2(200));
        System.out.println(isLeapYear2(400));
    }

    static boolean isLeapYear(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }

        return false;
    }

    static boolean isLeapYear2 (int n) {
        if (n % 4 != 0)
            return false;
        System.out.println("therefore, " + n +" % 4 = 0");
        if (n % 100 != 0)
            return true;
        System.out.println("therefore, " + n +" % 100 != 0");
        if (n % 400 != 0)
            return false;
        System.out.println("therefore, " + n +" % 400 = 0");
        return true;
    }
}
