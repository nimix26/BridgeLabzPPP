class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c) {
        System.out.println("Account opened in " + bankName + " for " + c.name);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI Bank");
        Customer c1 = new Customer("Nimit", 5000);

        bank.openAccount(c1);
        c1.viewBalance();
    }
}

