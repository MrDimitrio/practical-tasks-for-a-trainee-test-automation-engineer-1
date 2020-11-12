package io.github.valentyn.nahai.basics.oop.polymorphism;

public class Primate extends Animal{

    public Primate(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Primate can jump");

    }

    @Override
    public void makeSound() {
        System.out.println("Primate can noise");

    }

    @Override
    public void eat() {
        System.out.println("Primate like bananas");
    }
}
