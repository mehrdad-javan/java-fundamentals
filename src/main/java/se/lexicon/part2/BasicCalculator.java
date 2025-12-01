package se.lexicon.part2;

import java.math.BigInteger;

public class BasicCalculator {

    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static double add(double number1, double number2){
        return number1 + number2;
    }

    public static int add(int... numbers){ // 1,2,2,3
        int sum = 0;
        for (int number  :  numbers ){
            sum = sum + number;
        }
        return sum;
    }

    public static BigInteger add(BigInteger number1, BigInteger number2){
        return number1.add(number2);
    }

}
