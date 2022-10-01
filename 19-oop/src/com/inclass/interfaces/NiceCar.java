package com.inclass.interfaces;

public class NiceCar {
    private Engine engine;
    private Media radio = new Radio();

    public NiceCar() {
        engine = new PetrolEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startRadio() {
        radio.start();
    }

    public void stopRadio() {
        radio.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine upgraded");
    }
}
