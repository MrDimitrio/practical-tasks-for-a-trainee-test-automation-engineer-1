package io.github.valentyn.nahai.basics.input;

import java.util.Scanner;

/*
 * Into:
 * Body mass index (BMI) is a value derived from the mass (weight) and height of a person. 
 * The BMI is defined as the body mass divided by the square of the body height, 
 * and is universally expressed in units of kg/m2,
 * resulting from mass in kilograms and height in metres.
 * 
 * Task:
 * Create a basic BMI calculator.
 * The sample output:
 * Your height in m: 1.85
 * Your weight in kg: 77
 * ---------------------
 * Your BMI is 22.5
 */
public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("Hello, I`m BMI calculator");
        System.out.println("In the next few minutes, I will calculate your BMI");

        Scanner scan = new Scanner(System.in);
        System.out.println("Type your mass:  ");
        double m = scan.nextDouble();
        System.out.println("Type your height:  ");
        double h = scan.nextDouble();
        System.out.println("Your height in m:  " + h);
        System.out.println("Your weight in kg: " + m);
        System.out.println("***********************");
        System.out.println("Your BMI is" + (m / (h * h)));
    }   
}
