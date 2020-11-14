package io.github.valentyn.nahai.basics.oop.inheritance.people;

public class Cleaner extends Person {

    public Cleaner(String name, String address, String gender, int numberOfFloors) {
        super(name, address, gender);
        
    }

    @Override
    public void work() {
        System.out.println("The cleaner makes the world more beautiful");
    }
    public String dream (){
        return "Become a student and then a professor";
    }
       
}
