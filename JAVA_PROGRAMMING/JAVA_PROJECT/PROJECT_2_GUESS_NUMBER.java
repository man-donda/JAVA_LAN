import java.util.*;

public class PROJECT_2_GUESS_NUMBER {
    static Scanner sc = new Scanner(System.in);

    public static void playGame(int maxRange) {

        int randomNumber = (int) (Math.random() * maxRange) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("\nThe number is selected between 1 and " + maxRange);
        System.out.println("Try to guess it!\n");

        while (guess != randomNumber) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too Low! Try again.\n");
            } else if (guess > randomNumber) {
                System.out.println("Too High! Try again.\n");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.\n");
            }
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Enter 1 for Start the Game.");
            System.out.println("Enter 2 for Exit the Game.");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Welcome to Number Guessing Game!");
                    playGame(100);
                    break;

                case 2:
                    System.out.print("Thanks for playing! Exiting Game.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        } while (choice != 2);
    }

}
