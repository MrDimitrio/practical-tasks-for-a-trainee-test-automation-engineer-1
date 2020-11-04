package io.github.valentyn.nahai.basics.oop.recursion;
/**
 * Task:
 * Create overloaded methods for summarizing and printing 2 numbers of different types as many as you want.
 * These methods can be static and declared in the class with the "main" method.
 *
 * Задание:
 * Создайте перегруженные методы для суммирования и печати 2 чисел разных типов.
 * Эти методы могут быть статическими и объявляться в классе с "main" методом.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        sumAndPrint(4, 5);
        sumAndPrint(6.7, 4.5);
        sumAndPrint(6, 6.66, 66);
        sumAndPrint(5.55f, 7.77f);
        sumAndPrint(88, 3.3, 11.1f, 50);
    }

    public static void sumAndPrint(int firstNumber, int secondNumber) {
        System.out.println("The sum of two integer values is " + (firstNumber + secondNumber));
    }

    public static void sumAndPrint(double firstNumber, double secondNumber) {
        System.out.println("The sum of two double values is " + (firstNumber + secondNumber));
    }

    public static void sumAndPrint(int firstNumber, double secondNumber, int thirdNumber) {
        System.out.println("The sum of integer and double is: " + (firstNumber + secondNumber + thirdNumber));
    }

    public static float sumAndPrint(float firstNumber, float secondNumber) {
        System.out.println("The sum of floats is: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }

    public static void sumAndPrint(int firstNumber, double secondNumber, float thirdNumber, int forthNumber) {
        System.out.println("The total sum is: " + (firstNumber + secondNumber + thirdNumber + forthNumber));
    }
}