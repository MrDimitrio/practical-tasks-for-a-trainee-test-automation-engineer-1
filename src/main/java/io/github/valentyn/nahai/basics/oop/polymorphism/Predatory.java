package io.github.valentyn.nahai.basics.oop.polymorphism;

public class Predatory extends Mammal{

    public Predatory(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Predators sneak up and attack");

    }

    @Override
    public void makeSound() {
        System.out.println("Predators can growl");

    }

    @Override
    public void eat() {
        System.out.println("Predators can eat");

    }
}
