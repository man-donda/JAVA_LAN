import java.util.*;

public class timer {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in format (minutes.seconds) like 1.30 : ");
        String input = sc.next();

        // Split minutes and seconds
        String[] parts = input.split("\\.");

        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);

        int totalSeconds = (minutes * 60) + seconds;

        System.out.print("Timer: ");

        try {
            for (int i = 0; i <= totalSeconds; i++) {

                int currentMin = i / 60;
                int currentSec = i % 60;

                // Format as MM:SS
                System.out.print("\rTimer: " + 
                        String.format("%02d:%02d", currentMin, currentSec));

                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("\nTimer Interrupted!");
        }

        System.out.println("\nTime Finished!");
    }
}
