import java.util.*;

public class tut07_FUNCTIONS_MULTI {

    public static int printProd(int a, int b){
        int multi = a * b;
        System.out.println("The product of given number is "+multi);
        return multi;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        printProd(a, b);
    }
    
}
