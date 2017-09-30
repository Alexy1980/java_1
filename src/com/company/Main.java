package com.company;

public class Main {
    public static void main(String[] args){
        System.out.format("Hello %s !\n", args[0]);
        Car raceCar = new RaceCar();
        Car simpleCar = new SimpleCar();
        // используем геттер и сеттер для реализации инкапсуляции
        raceCar.setSpeed(200);
        raceCar.go();
        simpleCar.go();
        simpleCar.volumeEngine();
    }
}
