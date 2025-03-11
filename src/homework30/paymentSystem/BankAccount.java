package homework30.paymentSystem;

public class BankAccount implements PaymentSystem {
    private double balance;
    private String currency = "EUR";

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " " + currency);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " " + currency);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance: " + balance + " " + currency);
        return balance;
    }
}
