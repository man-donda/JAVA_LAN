import java.util.*;

public class tut18_TOWER_OF_HANOI {

    public static void TOH(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to " + dest);
            return;
        }

        TOH(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to " + dest);
        TOH(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 1;
        TOH(n, "S", "H", "D");
    }
}
