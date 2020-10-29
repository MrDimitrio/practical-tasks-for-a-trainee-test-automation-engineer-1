package io.github.valentyn.nahai.basics.loops;

import java.util.Random;
import java.util.Scanner;

/*
 * Task:
 * Create a program that will set a random secret number, ask the user to input a guess number,
 * and keep printing the prompt message until the number is revealed.
 * Use do-while loop.
 *
 * Создайте программу, которая будет задавать произвольное секретое число, спрашивать пользователя ввести
 * число для одгадывания, продолжать печатать приглашения для ввода, пока число не будет раскрыто.
 * Используйте do-while цикл.
 */
public class GuessingNumber {
    public static void main(String[] args) {
        
        Random random = new Random(5);
        Scanner scan = new Scanner(System.in);
        int a = random.nextInt(5);
        int b;
        System.out.println("Guess the number from 0 to 5: ");
        do { 
            System.out.println("Type a number: ");
            b = scan.nextInt();
        } while (a != b);
            System.out.println("Bingo!");
            
    }
}