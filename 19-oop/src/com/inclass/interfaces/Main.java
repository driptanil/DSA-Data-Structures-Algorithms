package com.inclass.interfaces;

public class Main {
    public static void main(String[] args) {
        /*
        Car car = new Car();
        car.accelerate();
        car.start();
        car.stop();
        */

        NiceCar car = new NiceCar();

        car.start();
        car.startRadio();
        car.upgradeEngine(new ElectricEngine());
        car.start();
    }
}
