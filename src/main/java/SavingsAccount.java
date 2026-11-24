public class SavingsAccount implements BankAccount {
    double balance;
    double interestRate = 0.033;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }


    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        return this.balance -= amount;
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
