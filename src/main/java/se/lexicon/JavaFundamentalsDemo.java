package se.lexicon;

public class JavaFundamentalsDemo {

    void main() {
        // Variables:
        // syntax: [data type] [variableName] = [value];
        int speed = 100;
        System.out.println("Speed:" + speed); // Output = Speed: 100
        speed = 120;

        // sout + tab
        System.out.println("Speed is: " + speed);

        double salary;
        salary = 5555.55;

        float area = 2.21f; // f suffix for float literals

        long balance = 999999999999999L;

        // To reformat the code ->    Ctrl + Alt + L

        boolean isActive = true;
        char grade = 'A';

        int number1 = 10;
        int number2 = 5;
        // + - % / *
        System.out.println(number1 / number2); // 2
        System.out.println(number1 % number2); // 0


        // Comparision Operators:
        int a = 10, b = 20;
        boolean isEqual = a == b;
        System.out.println("a == b " + isEqual); // false

        // Selections:
        int age = 22;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 55 || marks <= 60) {
            System.out.println("Grade FX");
        } else {
            System.out.println("Grade F");
        }


        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
