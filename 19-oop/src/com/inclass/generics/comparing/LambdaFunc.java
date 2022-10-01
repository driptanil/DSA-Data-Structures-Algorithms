package com.inclass.generics.comparing;

import java.util.ArrayList;

public class LambdaFunc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        /*list.forEach((item) -> {
            System.out.println(item * 2 + " ");
        });*/

        Operation sum = (a, b) -> a + b;
        Operation pro = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaFunc myCalculator = new LambdaFunc();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(5, 3, pro));
        System.out.println(myCalculator.operate(5, 3, div));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    /*static int sum (int a, int b) {
        return a + b;
    }*/
}

interface Operation {
    int operation(int a, int b);

}
