package se.lexicon;

public class Person {
    String firstName;
    String lastName;
    int age;
    String hobby;

    public String getPersonInfo() {
        return firstName + " " + lastName + " is " + age + " years old and likes " + hobby;
    }
}
