package se.lexicon.part2;

public class BankAccount {

    // accountHolder
    String accountHolder;
    // balance
    double balance;

    // interestRate
    static double interestRate = 5.0;

    public void deposit(double amount){
        // this.balance = this.balance + amount;
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= 0){
            // generate an error
            throw new IllegalArgumentException("Amount must be a positive number!");
        }
        if (amount > this.balance){
            throw new IllegalArgumentException("Insufficient founds");
        }

        this.balance -= amount;

    }

    public void displayAccountInfo(){
        System.out.println("Name: " + this.accountHolder + " , Balance: " + this.balance + " ,Rate: " +BankAccount.interestRate);
    }

    public static double calculateLoanRepayment(double amount, int years){
        // total = principal + (principal * Rate * Time)
        return amount + (amount * (interestRate / 100) * years);
    }



}
