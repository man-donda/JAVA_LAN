import java.util.*;

public class tut07_FUNCTIONS_FACTO {

    public static void findFactorial(int n) {
        if(n<0){
            System.out.println("Invalid number.");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("The factorial of given number is " + fact);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();

        findFactorial(a);
    }

}
