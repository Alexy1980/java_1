package com.company;

public class CarImpl implements Car {
    public int getSpeed() {
        return speed;
    }
    // alt + insert getters and setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed = 100;
    public void go(){
        System.out.println("Go at speed " + speed + " km/h");
    }
}
