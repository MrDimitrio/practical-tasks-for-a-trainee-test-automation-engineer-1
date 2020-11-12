package io.github.valentyn.nahai.basics.oop.polymorphism;

public abstract class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }

        @Override
        public void move() {
            System.out.println("Mammal can move");

        }

        @Override
        public void makeSound() {
            System.out.println("Mammal can makeSound");

        }

        @Override
        public void eat() {
            System.out.println("Mammal can eat");

        }
}
