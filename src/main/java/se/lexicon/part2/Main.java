package se.lexicon.part2;

import java.math.BigInteger;

public class Main {

    void main(){
       /* System.out.println(BasicCalculator.add(10.5,20.1));
        System.out.println(BasicCalculator.add(1,2,2,3));

        System.out.println(Long.MAX_VALUE);
        BigInteger bigInteger = new BigInteger("9223372036854775807");
        System.out.println(BasicCalculator.add(bigInteger, bigInteger)); // ?

        */

        Student student1 = new Student();
        student1.name = "Mehrdad";
        student1.rollNumber = 1;

        Student student2 = new Student();
        student2.name = "Simon";
        student2.rollNumber = 2;

        student1.displayStudent();
        student2.displayStudent();
        Student.showSchool();

         BankAccount bankAccount1 = new BankAccount();
         bankAccount1.accountHolder = "Account1";


        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.accountHolder = "Account2";

        bankAccount1.deposit(100);
        bankAccount2.deposit(500);

        bankAccount1.displayAccountInfo();
        bankAccount2.displayAccountInfo();

        System.out.println(BankAccount.calculateLoanRepayment(20000, 2));

    }
}
