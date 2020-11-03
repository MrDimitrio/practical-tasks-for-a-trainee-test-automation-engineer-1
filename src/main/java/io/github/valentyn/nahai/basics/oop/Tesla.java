package io.github.valentyn.nahai.basics.oop;

public class Tesla {
    public static void main(String[] args) {
         Car tesla = new Car();
         
         tesla.model = "Tesla Model X";
         tesla.fuel = "Electricity";
         tesla.maxSpeed = 250; 
         
        System.out.println("Model: " + tesla.model + "\n" +
            "Fuel: " + tesla.fuel + "\n" +
            "Max speed: " + tesla.maxSpeed);
    }
}
