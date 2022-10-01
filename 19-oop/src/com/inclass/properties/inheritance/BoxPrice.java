package com.inclass.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice() {
        this.price = 0;
    }

    BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }

    BoxPrice(BoxPrice old) {
        super(old);
        this.price = old.price;
    }
}
