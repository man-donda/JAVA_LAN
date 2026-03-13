import java.util.*;

// Write a function which takes in 2 numbers and returns the greater of those two.

public class tut08_HW3 {
    public static void findGreater(int a, int b){
        if(a>b){
            System.out.println(a + " is greater.");
        }
        if(b>a){
            System.out.println(b+" is greater.");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers one by one : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        findGreater(a, b);
    }
}
