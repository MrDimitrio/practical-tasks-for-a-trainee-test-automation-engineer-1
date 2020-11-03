package io.github.valentyn.nahai.basics.oop;

public class Car {
    String model;
    String fuel;
    int maxSpeed;

    public Car() {
    } //дефолтный конструктор

    public Car(String model, String fuel, int maxSpeed) {
        this.model = model;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
    }
}
    
