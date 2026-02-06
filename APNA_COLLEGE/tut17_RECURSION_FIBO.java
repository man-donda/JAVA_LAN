import java.util.*;

public class tut17_RECURSION_FIBO {


// Print Fibo : 
    // public static void Fib(int a, int b, int n) {
    //     if(n == 0){
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.println(c);
    //     Fib(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //      int a = 0, b = 1;
    //      System.out.println(a);
    //      System.out.println(b);
    //      int n = 7;
    //      Fib(a, b, n-2);
    // }


// Find X power n trick - 1 :
    // public static int calcPow(int x, int n) {
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 1;
    //     }
    //     int xpow1 = calcPow(x, n-1);
    //     int xpow = x * xpow1;
    //     return xpow;
    // }
    // public static void main(String[] args) {
    //      int x = 2 , n = 5;
    //      int ans = calcPow(x, n);
    //      System.out.println(ans);
    // }
    

// Find x power n trick - 2 :
    public static int calcPow(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 1;
        }
        
        if(n%2 == 0){
            return calcPow(x, n/2) * calcPow(x, n/2);
        }
        else{
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
         int x = 2 , n = 5;
         int ans = calcPow(x, n);
         System.out.println(ans);
    }
}
