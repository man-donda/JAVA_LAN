import java.util.*;

interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

class NetBankingPayment implements Payment {
    public void pay() {
        System.out.println("Paid using Net Banking");
    }
}

class checkout {
    void processPayment(Payment payment) {
        payment.pay();
    }
}

public class EXAMPLE_2 {
    public static void main(String[] args) {

        Payment upi = new UpiPayment();
        Payment netBanking = new NetBankingPayment();

        checkout checkout = new checkout();
        // checkout.processPayment(upi);
        // checkout.processPayment(netBanking);
        int choice;
        do {
            System.out.println("Enter 1 for pay using UPI");
            System.out.println("Enter 2 for pay using Net Banking");
            System.out.println("Enter 3 for Exit");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkout.processPayment(upi);
                    break;

                case 2:
                    checkout.processPayment(netBanking);
                    break;

                case 3:
                    System.out.println("Exit the Task");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 3);
    }
}
