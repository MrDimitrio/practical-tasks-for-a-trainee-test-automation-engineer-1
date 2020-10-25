package io.github.valentyn.nahai.basics.multibranch.operator;

import java.util.Scanner;

/**
 * Task:
 * Create a program that output the type of a week day according to its number.
 * The number of the week day the user should be able to specify in the input.
 * Use Scanner class to read input stream from the keyboard.
 * Your solution MUST include the usage of the "switch" operator. 
 * Try to use "case" branches in the most effective way.
 * Assume for this task that there are only 2 type: working and weekend days.
 */
public class TypesOfWeekDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ordinal number of the day of the week");
        int dayOfTheWeek = scan.nextInt();
        String weekDay;

        switch (dayOfTheWeek) {
            case 1 : weekDay = "It's a working day, GO and work !!";
            case 2 : weekDay = "It's a working day, GO and work !!";
            case 3 : weekDay = "It's a working day, GO and work !!";
            case 4 : weekDay = "It's a working day, GO and work !!";
            case 5 : weekDay = "It's a working day, GO and work !!";
                break;
            case 6 : weekDay = "Congratulations, it's a day off !!";
            case 7 : weekDay = "Congratulations, it's a day off !!";
                break;
            default : weekDay = "Don't panic, sysadmins are notified of the problem";
                break;
        }
        System.out.println(weekDay); 
    }
}
