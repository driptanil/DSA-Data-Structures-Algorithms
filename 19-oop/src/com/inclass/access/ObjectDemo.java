package com.inclass.access;

import java.util.Arrays;

public class ObjectDemo {

    int num = 0;

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ObjectDemo(int num) {
        this.num = num;
    }

    public static void main (String[] args) {
        /*
        ObjectDemo obj = new ObjectDemo(18);
        System.out.println(obj.hashCode());
        */

        /*
        ObjectDemo obj = new ObjectDemo(18);
        ObjectDemo obj2 = obj;

        if (obj == obj2) {
            System.out.println("Same Object");
        }

        if (obj.equals(obj2)) {
            System.out.println("Same Object");
        }
        */

        /*
        ObjectDemo obj = new ObjectDemo(19);
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getCanonicalName());
        System.out.println(Arrays.toString(obj.getClass().getConstructors()));
        */

        ObjectDemo obj = new ObjectDemo(20);
        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj instanceof Object);

    }
}
