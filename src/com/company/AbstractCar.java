package com.company;

public abstract class AbstractCar implements Car {
    // в абстрактном классе можно некоторые методы интерфейса можно не реализовывать
    public int getSpeed() {
        return speed;
    }

    // alt + insert getters and setters
    public void setSpeed(int speed) {
        this.speed = speed + 12;
    }

    protected int speed = 100;

    public void go(){
        out("\n" + this.getClass().getSimpleName() + " " + "Go at speed " + speed + " km/h\n" + " and "
        + "volumeEngine " + volumeEngine());
    }

    private void out(String str){
        System.out.println(str);
    }

}
