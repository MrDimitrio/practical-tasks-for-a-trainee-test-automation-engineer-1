package io.github.valentyn.nahai.basics.oop.inheritance.people;

// Uncomment, fix and expand the class

public class Student extends Person {
    private String universityName;
    private int credits;

    public Student(String name, String address, String gender, String universityName, int credits) {
        super(name, address, gender);
        this.universityName = universityName;
        this.credits = credits;
    }

    public String getUniversityName() {
        return universityName;
    }
    public int getCredits() {
        return credits;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void study() {
        credits += 1;
    }

    @Override
    public void work() {
        System.out.println("Student - learns new knowledge");
    }
    public String preference (){
        return "Students prefer parties";
    }

    @Override
    public String toString() {
        return "Student{" +
            "universityName='" + universityName + '\'' +
            ", credits=" + credits +
            '}';
    }
}