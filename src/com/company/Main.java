package com.company;

public class Main {
    public static void main(String[] args){
        System.out.format("Hello %s !\n", args[0]);
        Car car = new Car();
        car.go();
    }
}
