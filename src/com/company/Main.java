package com.company;

public class Main {
    public static void main(String[] args){
        System.out.format("Hello %s !\n", args[0]);
        Car car = new CarImpl();
        Car car2 = new CarImpl();
        // используем геттер и сеттер для реализации инкапсуляции
        car.setSpeed(200);
        System.out.println(car.getSpeed());
        car.go();
        car2.go();
    }
}
