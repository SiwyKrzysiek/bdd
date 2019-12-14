package pw.models;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (this.balance - balance < 0)
            throw new IllegalStateException("Acount balance can't go below 0");

        this.balance = balance;
    }

    public void withdraw(double amount) {
        setBalance(balance - amount);
    }
}
