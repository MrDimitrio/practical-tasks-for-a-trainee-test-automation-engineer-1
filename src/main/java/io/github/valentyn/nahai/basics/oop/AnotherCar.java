package io.github.valentyn.nahai.basics.oop;

public class AnotherCar {
    private String anotherModel; 
    private String anotherFuel;
    private int anotherMaxSpeed;
    // другой класс, где поля private, и что бы к ним достучаться испульзую гетеры и сетеры
   
    public String getAnotherModel() {
        return anotherModel;
    }

    public void setAnotherModel(String anotherModel) {
        this.anotherModel = anotherModel;
    }

    public String getAnotherFuel() {
        return anotherFuel;
    }

    public void setAnotherFuel(String anotherFuel) {
        this.anotherFuel = anotherFuel;
    }

    public int getAnotherMaxSpeed() {
        return anotherMaxSpeed;
    }

    public void setAnotherMaxSpeed(int anotherMaxSpeed) {
        this.anotherMaxSpeed = anotherMaxSpeed;
    }
}

