import java.util.*;

public class tut18_REVERSE_STRING {
    public static void printRev(String str, int idx) {
        if(idx==0){
            System.out.print(str.charAt(idx)+" ");
            return;
        }

        System.out.print(str.charAt(idx)+" ");
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        String sc = "abcd";
        printRev(sc, sc.length()-1);

    }
}
