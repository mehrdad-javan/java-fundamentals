package se.lexicon;

import java.util.Random;
import java.util.Scanner;

/**
 * # Exercises
 * <p>
 * This class contains multiple small Java exercises as separate methods.
 * Each method demonstrates a different fundamental concept.
 */
public class ExercisesSolution {

    public static void main(String[] args) {
        System.out.println("Exercise 1:");
        printHello();

        // Uncomment the ones you want to test:

        // System.out.println("Exercise 2:");
        // checkLeapYear();

        // System.out.println("Exercise 3:");
        // basicArithmetic();

        // System.out.println("Exercise 4:");
        // calculateAverage();

        // System.out.println("Exercise 5:");
        // greetUser();

        // System.out.println("Exercise 6:");
        // arithmeticWithUserInput();

        // System.out.println("Exercise 7:");
        // convertSecondsToHMS();

        // System.out.println("Exercise 8:");
        // guessTheNumber();
    }

    /**
     * # Exercise 1
     * <p>
     * ### Question
     * Write a Java program to print `Hello` on the screen and then print your name on a separate line.
     */
    static void printHello() {
        System.out.println("Hello");
        System.out.println("Ali!");
    }


    /**
     * # Exercise 2
     * <p>
     * ### Question
     * Create a program that takes a year as input from the user and checks whether it is a leap year.
     */
    static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }


    /**
     * # Exercise 3
     * <p>
     * ### Question
     * Write a Java program to print the sum, multiplication, division, and subtraction of two numbers.
     */
    static void basicArithmetic() {
        System.out.println("45 + 11 = " + (45 + 11));
        System.out.println("12 * 4 = " + (12 * 4));
        System.out.println("24 / 6 = " + (24 / 6));
        System.out.println("55 - 12 = " + (55 - 12));
    }


    /**
     * # Exercise 4
     * <p>
     * ### Question
     * Write a Java program that prints the average of three numbers.
     */
    static void calculateAverage() {
        int num1 = 23, num2 = 11, num3 = 77;
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 3 = " + average);
    }


    /**
     * # Exercise 5
     * <p>
     * ### Question
     * Create a program that asks the user to input their name and stores it in a variable. Then print `Hello <username>`.
     */
    static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }


    /**
     * # Exercise 6
     * <p>
     * ### Question
     * Create a program that asks the user to input two numbers and prints the sum, multiplication, division, and subtraction of the given numbers.
     */
    static void arithmeticWithUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " - " + b + " = " + (a - b));
    }


    /**
     * # Exercise 7
     * <p>
     * ### Question
     * Create a program that converts seconds to hours, minutes, and seconds.
     */
    static void convertSecondsToHMS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;

        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(formattedTime);
    }


    /**
     * # Exercise 8
     * <p>
     * ### Question
     * Write a program that generates a random number between 1 and 500. The user must guess the number, and the program will provide feedback ("too small", "too big") until the correct number is guessed.
     */
    static void guessTheNumber() {
        Random random = new Random();
        int targetNumber = random.nextInt(500) + 1;
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        System.out.println("Guess the number (between 1 and 500):");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Your guess was too small.");
            } else {
                System.out.println("Your guess was too big.");
            }
        }
    }
}