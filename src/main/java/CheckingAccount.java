public class CheckingAccount implements BankAccount {
    double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
