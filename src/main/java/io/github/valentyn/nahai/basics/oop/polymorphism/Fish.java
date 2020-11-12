package io.github.valentyn.nahai.basics.oop.polymorphism;

public class Fish extends Animal{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Fish can swim");

    }

    @Override
    public void makeSound() {
        System.out.println("Fish can gurgle");

    }

    @Override
    public void eat() {
        System.out.println("Fish can eat");

    }
}
