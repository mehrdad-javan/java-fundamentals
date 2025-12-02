# String Exercises – Questions and Solutions

---

## Exercise 1

### Question
What is the length of the String: "Java"?

### Java Code
```java
private static void task1() {
        String str1 = "Java";
        System.out.println("1. Length of the String: " + str1.length());
    }
```

---

## Exercise 2

### Question
What char is at index position 6 in the following String: "Long example sentence"?

### Java Code
```java
private static void task2() {
        String str2 = "Long example sentence";
        char charAtIndex6 = str2.charAt(6);
        System.out.println("2. Char at index 6: " + charAtIndex6);
    }
```

---

## Exercise 3

### Question
What is the index position of 'o' in the following String: "Even longer example sentence"?

### Java Code
```java
private static void task3() {
        String str3 = "Even longer example sentence";
        int indexOfO = str3.indexOf('o');
        System.out.println("3. Index of 'o': " + indexOfO);
    }
```

---

## Exercise 4

### Question
Given the following String: "Ok this is not as long!", create a substring of only "not as long" (excluding the exclamation point) and print it out.

### Java Code
```java
private static void task4() {
        String str4 = "Ok this is not as long!";
        String subString = str4.substring(str4.indexOf("not"), str4.indexOf("!"));
        System.out.println("4. Substring: " + subString);
    }
```

---

## Exercise 5

### Question
Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to uppercase and print it out again.

### Java Code
```java
private static void task5() {
        String str5 = "CAPS EQUALS SCREAMING";
        System.out.println("5. Original: " + str5);
        str5 = str5.toLowerCase();
        System.out.println("   Lowercase: " + str5);
        str5 = str5.toUpperCase();
        System.out.println("   Uppercase: " + str5);
    }
```

---

## Exercise 6

### Question
What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?

### Java Code
```java
private static void task6() {
        String str6 = "\tJ\ta\tv\ta\t";
        String trimmedStr6 = str6.trim();
        System.out.println("6. Trimmed String: " + trimmedStr6);
    }
```

---

## Exercise 7

### Question
Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".

### Java Code
```java
private static void task7() {
        int number = 20;
        String str7 = String.valueOf(number) + "20";
        System.out.println("7. Combined String: " + str7);
    }
```

---

## Exercise 8

### Question
Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words "Oil","Water" and store them in a String array.

### Java Code
```java
private static void task8() {
        String str8 = "Oil and Water";
        String[] words = str8.split(" ");
        System.out.println("8. Words: " + words[0] + ", " + words[1]);
    }
```

---

## Exercise 9

### Question
Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately.

### Java Code
```java
private static void task9() {
        String str9 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = str9.split(",");
        System.out.println("9. Names:");
        for (String name : names) {
            System.out.println("   " + name);
        }
    }
```

---

## Exercise 10

### Question
Convert the following String: "ThisShouldBeConverted" to a char array. Iterate through the char array and print out each element.

### Java Code
```java
private static void task10() {
        String str10 = "ThisShouldBeConverted";
        char[] charArray = str10.toCharArray();
        System.out.println("10. Char Array:");
        for (char ch : charArray) {
            System.out.println("   " + ch);
        }
    }
```

---

## Exercise 11

### Question
Convert the following char[]: {'J','a','v','a'} to a String and print it out.

### Java Code
```java
private static void task11() {
        char[] charArray11 = {'J', 'a', 'v', 'a'};
        String convertedString = new String(charArray11);
        System.out.println("11. Converted String: " + convertedString);
    }
```

