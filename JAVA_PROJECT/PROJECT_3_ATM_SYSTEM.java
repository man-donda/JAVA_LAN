import java.util.*;

public class PROJECT_3_ATM_SYSTEM {
    
    private double balance;
    private final int PIN = 1234;  // Default PIN

    public PROJECT_3_ATM_SYSTEM(double b) {
        this.balance = b;
    }

    public boolean login(int enteredPin) {
        return enteredPin == PIN;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: Rs." + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PROJECT_3_ATM_SYSTEM atm = new PROJECT_3_ATM_SYSTEM(5000); 

        System.out.println("----- Welcome to ATM -----");

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (!atm.login(enteredPin)) {
            System.out.println("Incorrect PIN.");
            return;
        }

        System.out.println("Login Successful!");

        int choice;
        do {
            System.out.println("\n----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);
    }
}