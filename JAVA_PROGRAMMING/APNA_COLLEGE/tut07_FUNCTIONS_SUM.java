import java.util.*;

public class tut07_FUNCTIONS_SUM {

    public static int sum(int a, int b){
        int sum = a + b;
        System.out.println("The sum is "+sum);
        return sum;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a, b);

    }
    
}
