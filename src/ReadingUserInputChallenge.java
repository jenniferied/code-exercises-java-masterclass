/** Reading User Input Challenge
 * " The challenge:
 * - Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * - Create a Scanner and use the hasNextInt() method to check if the user has entered an int value.
 * - If hasNextInt() returns false, print the message "Invalid Number".
 * - Continue reading until you have read 10 numbers.
 * - Use the nextInt() method to get the number and add it to the sum.
 * - Before the user enters each number, print the message "Enter number #x:" where x represents the count.
 *
 * Hint: use a while loop, use a counter and close the scanner when not needed anymore.
 *
 * Reading User Input can be done via the Scanner Class.
 * As opposed to System.out System.in takes data into the system to be processed.
 *
 * The keyword new creates a new Instance of an Object from a class.
 *
 * Objectives:
 * - introduce Parsing
 * - introduce Scanner Class"
 */

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        challenge();
        readUserInput();
    }

    public static void challenge() {
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(counter < 2) {
            System.out.println("Enter number #" + (counter+1) + ":");

            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // Important to handle extra input
        }
        System.out.println(sum);
    }

    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter");
        scanner.nextLine();
        System.out.println("Enter your year of birth:");

        // Function that checks but does not remove from input.
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2021 - yearOfBirth;

            // When entering two values into the console after one another,
            // call another line to handle enter without assigning to a value.
            scanner.nextLine();

            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            // Handle invalid input - year out of range
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name);
                System.out.println("Your age is: " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
    }
}