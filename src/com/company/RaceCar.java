package com.company;

public class RaceCar extends AbstractCar {
    // переопределим скорость
    RaceCar(){
        speed = 200;
    }

    @Override
    public double volumeEngine() {
        return 3.5;
    }
}
