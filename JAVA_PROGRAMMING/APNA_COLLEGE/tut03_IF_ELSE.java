import java.util.*;

public class tut03_IF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        }

        else if (num1 > num2) {
            System.out.println("First Number is greater than second number.");
        }

        else {
            System.out.println("Second Number is greater than First number.");
        }

        // ---------------------------- Even - Odd ----------------------------------

        // System.out.println("Enter number : ");
        // int num = sc.nextInt();

        // if(num==0){
        // System.out.println("Entered number is Zero");
        // }

        // else if(num%2==0){
        // System.out.println("Entered number is Even.");
        // }

        // else{
        // System.out.println("Entered number is Odd.");
        // }

        // -------------------------- Age Check -------------------------------

        // System.out.println("Enter age : ");
        // int age = sc.nextInt();

        // if(age>18){
        // System.out.println("You are an Adult.");
        // }

        // else {
        // System.out.println("You are not an Adult.");
        // }
    }
}
