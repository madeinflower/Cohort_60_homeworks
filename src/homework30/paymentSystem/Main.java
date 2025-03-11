package homework30.paymentSystem;

//Платежные системы
//Создайте интерфейс PaymentSystem с методами:
//withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
//depositTransfer(double amount) (поступление денег на счет);
//checkBalance() (остаток на счете).
//Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
//Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
//Убедитесь, что каждый класс корректно выполняет каждую из операций.

public class Main {
    public static void main(String[] args) {
        PaymentSystem bankAccount = new BankAccount(1000);
        PaymentSystem wallet = new ElectronicWallet(500);

        bankAccount.checkBalance();
        bankAccount.withdrawMoney(200);
        bankAccount.depositTransfer(150);
        bankAccount.checkBalance();

        wallet.checkBalance();
        wallet.withdrawMoney(100);
        wallet.depositTransfer(50);
        wallet.checkBalance();
    }
}
