package com.inclass.interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine Accelerate");
    }
}
