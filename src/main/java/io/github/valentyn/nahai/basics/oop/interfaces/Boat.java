package io.github.valentyn.nahai.basics.oop.interfaces;

public class Boat implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Plane implements the ability from Vehicle - startEngine");
    }

    @Override
    public void brake() {
        System.out.println("Plane implements the ability from Vehicle - brake");
    }

    @Override
    public void beep() {
        System.out.println("Plane implements the ability from Vehicle - beep");
    }
}
