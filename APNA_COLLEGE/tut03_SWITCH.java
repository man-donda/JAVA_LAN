import java.util.*;

public class tut03_SWITCH {
    public static void main(String[] args) {

        System.out.println("Enter 1 for Hello.");
        System.out.println("Enter 2 for Namaste.");
        System.out.println("Enter 3 for Bonjour.");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        // ------------------------- Using Switch --------------------------

        switch (choice) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid choice");
        }
        

        // ---------------------- Using Else - If ---------------------

        // if(choice==1){
        // System.out.println("Hello");
        // }

        // else if(choice==2){
        // System.out.println("Namaste");
        // }

        // else if(choice==3){
        // System.out.println("Bonjour");
        // }

        // else{
        // System.out.println("Invalid Choice");
        // }

    }

}
