package BridgeLabzPPP.OOPS;

public class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;  // using this to avoid confusion
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Nimit");
        BankAccount acc2 = new BankAccount(102, "Rohit");

        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
