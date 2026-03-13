import java.util.*;

class Account {
    private String accountHolder;
    private int balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " and your current balance is: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Your current balance is: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " and your current balance is: " + balance);
        }
    }
}

public class BANKAPP {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountHolder("Mann");
        account.deposit(10000);
        account.withdraw(3000);
    }
}
