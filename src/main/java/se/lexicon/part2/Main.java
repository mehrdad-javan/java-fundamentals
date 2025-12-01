package se.lexicon.part2;

import java.math.BigInteger;

public class Main {

    void main(){
        System.out.println(BasicCalculator.add(10.5,20.1));
        System.out.println(BasicCalculator.add(1,2,2,3));

        System.out.println(Long.MAX_VALUE);
        BigInteger bigInteger = new BigInteger("9223372036854775807");
        System.out.println(BasicCalculator.add(bigInteger, bigInteger)); // ?

    }
}
