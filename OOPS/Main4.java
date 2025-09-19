package BridgeLabzPPP.OOPS;

// Interface
interface Loanable {
    void applyForLoan(double amount);
    String calculateLoanEligibility();
}

// Abstract class
abstract class BankAccount {
    private String accountNumber, holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if(balance >= amount) balance -= amount; }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }

    @Override
    public String calculateLoanEligibility() {
        return getBalance() > 5000 ? "Eligible for loan" : "Not Eligible";
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    public double calculateInterest() { return getBalance() * 0.02; }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }

    @Override
    public String calculateLoanEligibility() {
        return getBalance() > 10000 ? "Eligible for loan" : "Not Eligible";
    }
}

// Main
public class Main4 {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("S101", "Nimit", 6000);
        BankAccount a2 = new CurrentAccount("C201", "Ravi", 12000);

        a1.displayDetails();
        System.out.println("Interest: " + a1.calculateInterest());

        a2.displayDetails();
        System.out.println("Interest: " + a2.calculateInterest());

        Loanable l1 = (Loanable) a1;
        Loanable l2 = (Loanable) a2;
        System.out.println(l1.calculateLoanEligibility());
        System.out.println(l2.calculateLoanEligibility());
    }
}

