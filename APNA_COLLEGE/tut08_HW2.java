import java.util.*;

// Write a function to print the sum of all odd numbers from 1 to n.

public class tut08_HW2 {

    public static void printSum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);    
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter natural number : ");
        int a = sc.nextInt();
        printSum(a);
    }
}
