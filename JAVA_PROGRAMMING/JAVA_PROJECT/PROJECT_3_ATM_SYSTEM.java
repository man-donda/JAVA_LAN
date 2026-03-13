import java.util.*;

public class PROJECT_3_ATM_SYSTEM {

    private double balance;
    private final int PIN; // Default PIN

    public PROJECT_3_ATM_SYSTEM(double b, int pin) {
        this.balance = b;
        this.PIN = pin;
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
            System.out.println("Rs." + amount + " withdrawn successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int newPin;
        while (true) {
            System.out.print("Set your 4-digit PIN: ");
            newPin = sc.nextInt();

            if (newPin >= 1000 && newPin <= 9999) {
                break;
            } else {
                System.out.println("Invalid PIN! PIN must be exactly 4 digits.");
            }
        }

        PROJECT_3_ATM_SYSTEM atm = new PROJECT_3_ATM_SYSTEM(5000, newPin);

        System.out.println("----- Welcome to ATM -----");

        while (true) {

            int attempts = 0;
            boolean isLoggedIn = false;

            while (attempts < 3) {
                System.out.print("Enter your PIN: ");
                int enteredPin = sc.nextInt();

                if (atm.login(enteredPin)) {
                    isLoggedIn = true;
                    break;
                } else {
                    attempts++;
                    System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
                }
            }

            if (isLoggedIn) {
                System.out.println("Login Successful!");
                break;
            } else {
                System.out.println("Too many incorrect attempts.");
                for (int i = 30; i > 0; i--) {
                    System.out.print("\rAccount locked. Try again in: " + i + " seconds ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Error occurred.");
                    }
                }

                System.out.println("\nYou can try again now.");
            }
        }

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
                    System.out.print("Enter amount to deposit: Rs.");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs.");
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