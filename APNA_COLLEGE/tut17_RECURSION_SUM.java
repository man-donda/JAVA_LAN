import java.util.*;

public class tut17_RECURSION_SUM {
    
// Sum of number n:
    // public static void printSum(int i, int n, int sum) {
    //     if(i ==n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);       
    // }
    // public static void main(String[] args) {
    //     printSum(1, 5, 0);
    // }

// Factorial of number n:
    public static int printFact(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        int fact1 = printFact(n-1);
        int Fact = n * fact1;    
        return Fact;   
    }
    public static void main(String[] args) {
        int n=5;
        int ans = printFact(n);
        System.out.println(ans);
    } 
}
