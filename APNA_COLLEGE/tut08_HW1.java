import java.util.*;

// Enter 3 numbers from the user & make a function to print their average.

public class tut08_HW1{
    public static void printAvg(int a, int b, int c){
        int avg;
        avg = (a + b + c)/3;
        System.out.println("The average is "+avg);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers one by one.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printAvg(a,b,c);
    }
}