package com.company;

public class SimpleCar extends AbstractCar {

    @Override
    public void go() {
        super.go();
        System.out.println("Переопределили метод go()");
    }

    @Override
    public double volumeEngine() {
        return 1.7;
    }
}
