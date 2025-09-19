package BridgeLabzPPP.Inheritance;

// File: BankDemo.java
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber; this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String acc, double bal, double interestRate) {
        super(acc, bal); this.interestRate = interestRate;
    }
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Savings, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    public CheckingAccount(String acc, double bal, double withdrawalLimit) {
        super(acc, bal); this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Checking, Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenureMonths;
    public FixedDepositAccount(String acc, double bal, int tenureMonths) {
        super(acc, bal); this.tenureMonths = tenureMonths;
    }
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Type: Fixed Deposit, Tenure: " + tenureMonths + " months");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S001", 5000, 4.0),
            new CheckingAccount("C001", 2000, 1000),
            new FixedDepositAccount("F001", 10000, 12)
        };
        for (BankAccount a : accounts) {
            a.displayAccountType();
            System.out.println();
        }
    }
}

