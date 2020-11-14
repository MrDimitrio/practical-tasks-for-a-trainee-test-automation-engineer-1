package io.github.valentyn.nahai.basics.oop.inheritance.people;

public class Rector extends  Person{
    private String universityName;

    public Rector (String universityName,  String degree, String course, String name, String gender, String  address ){
        super(name, address,  gender);
        this.universityName = universityName;
    }
    public String getUniversityName(){
        return universityName;
    }
    
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
   
    @Override
    public void work() {
        System.out.println("The rector runs the university");
    }

    @Override
    public String toString() {
        return "Rector{" +
            "universityName='" + universityName + '}';
    }
    
}
