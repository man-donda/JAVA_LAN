import java.util.*;

public class tut19_EX4 {
    
    public static int findWays(int n) {
        if(n <= 1){
            return 1;
        }

        int way1 = findWays(n-1);
        int way2 = (n-1) * findWays(n-2);
        return way1 + way2;
    }
    public static void main(String[] args) {
        int n = 4;
        int result = findWays(n);
        System.out.println(result);
    }
}
