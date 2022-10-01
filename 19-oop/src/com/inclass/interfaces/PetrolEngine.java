package com.inclass.interfaces;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Petrol Engine Accelerate");
    }
}
