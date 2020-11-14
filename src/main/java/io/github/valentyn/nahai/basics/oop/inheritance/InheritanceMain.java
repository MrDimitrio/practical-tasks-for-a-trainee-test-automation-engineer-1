package io.github.valentyn.nahai.basics.oop.inheritance;

import io.github.valentyn.nahai.basics.oop.inheritance.people.Cleaner;
import io.github.valentyn.nahai.basics.oop.inheritance.people.Professor;
import io.github.valentyn.nahai.basics.oop.inheritance.people.Rector;
import io.github.valentyn.nahai.basics.oop.inheritance.people.Student;

/**
 * Task:
 * There are a base Person class and subclasses (the Professor, Student classes).
 * You have to do the following:
 *   1. Complete Professor, Student classes by implementing abstract method work();
 *   2. Add getters and setters in each class;
 *   3. Add some specific methods to expand subclasses with new behavioral;
 *   4. Follow the principals of encapsulations;
 *   5. Create at least 3 new classes that inherit already provided ones and perform 4 points decribed in the above;
 * The classes to complete the task are in io.github.valentyn.nahai.oop.inheritance.people package.
 *
 * Задача:
 * Есть базовый класс Person и подклассы (классы Professor, Student).
 * Вам необходимо сделать следующее:
 *   1. Завершить классы профессора, ученика, реализовав абстрактный метод work ();
 *   2. Добавить геттеры и сеттеры в каждый класс;
 *   3. Добавить некоторые специфические методы для расширения подклассов с новым поведением;
 *   4. Следовать принципам инкапсуляции;
 *   5. Создать как минимум 3 новых класса, которые наследуют уже предоставленные, и выполнить 4 пункта, описанных выше;
 * Классы для выполнения задачи находятся в пакете io.github.valentyn.nahai.oop.inheritance.people.
 */


    public class InheritanceMain {
        public static void main(String[] args) {

            Rector rector = new Rector("Oxford", "Master of Science", "All", "William", "Male", "England");
            System.out.println("Rector files: " +  rector.getName());
            
            System.out.println();

            Professor professor = new Professor("Oxford", "Professor", "England", "Bill", "Male", "England");
            System.out.println("Professor files: " + professor.getName());
            System.out.println();
            
            Student student = new Student("Luke Skywalker","Polis Massa","male","Galaxy", 1);
            System.out.println("Student files : " + student.getName());
            System.out.println();

            Cleaner cleaner =new Cleaner("Neil Flynn", "Chicago", "male", 5);
            System.out.println("Cleaner files:  " + cleaner.getName());
            System.out.println();
        }
}
