import java.util.*;

public class tut19_EX3 {
    
    public static int setTiles(int n, int m) {
        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }

        int vertPlace = setTiles(n-m, m);
        int horiPlace = setTiles(n-1, m);
        return vertPlace + horiPlace;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int result = setTiles(n, m);
        System.out.println(result);
    }
}
