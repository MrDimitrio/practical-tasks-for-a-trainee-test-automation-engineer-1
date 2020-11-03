package io.github.valentyn.nahai.basics.oop;

public class Volvo {
    public static void main(String[] args) {
        Car volvo = new Car();

        System.out.println("Model: " + volvo.model + "\n" +
            "Fuel: " + volvo.fuel + "\n" +
            "Max speed: " + volvo.maxSpeed); // тут используется дефолтный конструктор
        
        System.out.println(volvo.model);
        
    }
         
}
