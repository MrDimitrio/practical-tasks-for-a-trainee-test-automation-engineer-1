package io.github.valentyn.nahai.basics.oop;

public class Mercedes {
    public static void main(String[] args) {
        Car mercedes = new Car("Gelik", "Disel", 240);

        System.out.println("Model: " + mercedes.model + "\n" +
                            "Fuel: " + mercedes.fuel + "\n" +
                            "Max speed: " + mercedes.maxSpeed);
    }
}
