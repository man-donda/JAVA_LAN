import java.util.*;

public class tut18_OCCURS_IN_STRING {

    public static int first = -1;
    public static int last = -1;

    public static void findOccur(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.err.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccur(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccur(str, 0, 'a');
    }
}