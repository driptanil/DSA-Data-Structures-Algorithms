package com.inclass.properties.polymorphism;

public class PrintObject {
    int n;

    public PrintObject(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "PrintObject{" +
                "n=" + n +
                '}';
    }

    public static void main(String[] args) {
        PrintObject n = new PrintObject(5);
        System.out.println(n);
    }
}
