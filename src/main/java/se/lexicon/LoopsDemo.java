package se.lexicon;

import java.util.Scanner;

public class LoopsDemo {

    void main() {

        ex3();

    }

    public static void ex1() {

        System.out.println("=== For Loop Example ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("number: " + i);
        }

    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === While Loop Example ===");
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Do you want to continue? (yes/no) ");
            String answer = scanner.nextLine(); // yes
            if (answer.equalsIgnoreCase("no")) {
                isContinue = false;
            }
        }
        System.out.println("Loop Ended.");
    }


    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Operation 1");
            System.out.println("Operation 2");
            System.out.println("Choose an option");
            option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Perform operation 1");
            } else if (option == 2) {
                System.out.println("Perform operation 2");
            }
        } while (option != 2);
        System.out.println("Exiting the menu, goodbye!");
    }

}
