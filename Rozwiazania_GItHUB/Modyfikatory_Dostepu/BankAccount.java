package Modyfikatory_Dostepu;

public class BankAccount implements Account {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Niewystarczajaca ilosc srodkow na koncie");
            return;
        } else {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }

}

