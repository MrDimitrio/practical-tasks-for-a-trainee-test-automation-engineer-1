package io.github.valentyn.nahai.basics.oop.recursion;
/**
 * Task:
 * Create a method that calculates fibonacci number using recursion.
 * The base formula is F(n) = F(n - 1) + F(n - 2).
 *
 * Задача:
 * Создайте метод, который вычисляет число Фибоначчи с помощью рекурсии.
 * Базовая формула: F (n) = F (n - 1) + F (n - 2).
 */

public class FibonacciNumber {

    public static void main(String[] args) {
        int number = 0;
        while(true) {
            System.out.println(fibo(number));
            number++;
        }
    }
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int f = fibo(n - 1) + fibo(n - 2);
        return f;
    }
}

