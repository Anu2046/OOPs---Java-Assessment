class BankAccount {
    private double balance;           // Hidden from outside
    protected String accountHolder;   // Accessible to subclasses

    void createAccount(String holder) {
        accountHolder = holder;
        System.out.println("Account created for " + accountHolder);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " successfully.");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " successfully.");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void showHolder() {
        // Accessing protected variable from parent
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.createAccount("Anusri");
        acc.deposit(5000);
        acc.withdraw(1200);
        acc.showHolder();
        System.out.println("Current Balance: ₹" + acc.getBalance());
    }
}

