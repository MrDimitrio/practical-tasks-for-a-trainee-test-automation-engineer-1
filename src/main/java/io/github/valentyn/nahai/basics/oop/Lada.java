package io.github.valentyn.nahai.basics.oop;

public class Lada {
    public static void main(String[] args) {
        AnotherCar lada = new AnotherCar();
        lada.setAnotherModel("Kopeyka");
        lada.setAnotherMaxSpeed(100);
        lada.setAnotherFuel("Petrol");

        System.out.println("model: " + lada.getAnotherModel() +"\n" + "maxspeed: " + lada.getAnotherMaxSpeed() 
            +"\n"+ "fuel: " + lada.getAnotherFuel());
        
    }
}
