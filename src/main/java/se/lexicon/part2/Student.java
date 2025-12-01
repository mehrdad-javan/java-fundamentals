package se.lexicon.part2;

public class Student {
    String name;
    int rollNumber;

    static String schoolName = "Test Name";

    void displayStudent(){
        System.out.println("Name: " + this.name + " " + "RoleNumber: " + this.rollNumber);
    }

    static void showSchool(){
        System.out.println("School: " + Student.schoolName);
    }
}
