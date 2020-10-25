package io.github.valentyn.nahai.basics.input;
import java.util.Scanner;

/*
 * Task:
 * Collect user info like their names, age, marriage status, insurance ID, total income in a year, etc.
 * You can use as an example from the ScannerUsageExample class.
 * You must use the most appropriate type for each variable and not just Strings for everything.
 * Do be shy to check other info out in the internet.
 */
public class CollectUserInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name? Type here: ");
        String name = scan.nextLine();
        System.out.println("What is your surname? Type here: ");
        String surname = scan.nextLine();
        System.out.println("What is you marital status? Select: Y/N  ");
        
        String maritalStatus = scan.nextLine();
        System.out.println("How old are you? Type here:  ");
        int age = scan.nextInt();        
        
        System.out.println("Name:  " + name);
        System.out.println("Surname:  " + surname);
        System.out.println("Age:  " + age);
        
        if (maritalStatus.equals("Y")) {
            System.out.println("Status:  Married");
        } else if (maritalStatus.equals("N")) {
            System.out.println("Status:  Single");
        } else {
            System.out.println("Status: Undefined");
        }    
        
    }
}
