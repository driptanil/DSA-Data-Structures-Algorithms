package com.inclass.staticEg;

public class StaticBlock {
    static int a = 4;
    static int b;

    // static block will only run once, when the first object is created
    // when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
//    @Override
//    public String toString() {
//        return name;
//    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + "  " + StaticBlock .b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);
    }
}
