import java.util.*;

public class tut04_QUIZ {
    public static void main(String[] args) {

        System.out.print("Enter natural number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        //-------------------- Print table of the given number ---------------------
        for(int i = 1; i <= 10; i++){
            System.out.println(i*num);
        }


        // // ---------------- Print sum of natural numbers -------------------
        // for (int i = 0; i <= num; i++) {
        //     sum += i;
        // }
        // System.out.println("the sum of the natural number is "+sum);
    }
}