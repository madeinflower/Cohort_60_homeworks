package homework30.paymentSystem;

interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
}