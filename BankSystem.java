abstract class BankAccount {
    private String accountNumber;
    private double balance;
    protected static double interestRate = 3.5;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void calculateInterest();
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    protected void updateBalance(double amount) {
        this.balance += amount;
    }

    protected double getBalance() { // Getter for balance
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = (super.interestRate / 100) * getBalance();
        System.out.println("Calculated Interest for Savings Account: " + interest);
        updateBalance(interest);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123456789", 1000.0);
        sa.displayAccountDetails();
        sa.calculateInterest();
        sa.displayAccountDetails();
    }
}
