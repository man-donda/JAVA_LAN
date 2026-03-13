import java.util.*;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

public class THROW_EX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new YoungerAgeException("You are not eligable to Vote.");
            } else {
                System.out.println("You can vote successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}