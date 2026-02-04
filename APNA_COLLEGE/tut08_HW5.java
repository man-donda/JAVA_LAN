import java.util.*;

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class tut08_HW5 {
    
    public static void checkAge(int a){
        if(a>18){
            System.out.println("You are eligable for vote.");
        }
        else{
            System.out.println("You are not eligable for vote.");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        checkAge(age);
    }

}
