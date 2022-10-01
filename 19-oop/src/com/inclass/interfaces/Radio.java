package com.inclass.interfaces;

public class Radio implements Media{

    @Override
    public void start() {
        System.out.println("Radio Started");
    }

    @Override
    public void stop() {
        System.out.println("Radio Stopped");
    }
}
