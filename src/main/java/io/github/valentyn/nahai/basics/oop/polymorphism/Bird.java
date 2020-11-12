package io.github.valentyn.nahai.basics.oop.polymorphism;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Bird can fly");

    }

    @Override
    public void makeSound() {
        System.out.println("Bird can chirp");

    }

    @Override
    public void eat() {
        System.out.println("Bird can peck grain");

    }
}
