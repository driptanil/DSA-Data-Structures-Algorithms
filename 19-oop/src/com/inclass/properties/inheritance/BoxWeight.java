package com.inclass.properties.inheritance;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight() {
        this.weight = 0;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // super keyword calls the parent class constructor directly above
        // used to initialise values present in parent class
        // private variables in parent class, cannot be accessed in child class
        super(l, h, w);
        this.weight = weight;

        /*
        this.weight = weight;
        super(l, h, w);

        // ::ERROR::
        // the child class carries about parent class
        */

        /*System.out.println(this.w);
        System.out.println(super.w);*/
        // directly access to parent class directly above

    }

    BoxWeight(BoxWeight other) {
        super(other);
        // NOTE: This line does not give any error
        // Box(Box old) {} constructor is used in parent class
        // Similar to Box box6 = new BoxWeight(1, 2, 3, 4);
        weight = other.weight;
    }
}
