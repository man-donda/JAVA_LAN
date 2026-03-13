import java.util.*;

class Test2 {
    int i;
    String str;

    Test2() {
        System.out.println("No Argument Constructor");
    }
}

public class NO_ARGS_CONST {
    public static void main(String[] args) {

        Test2 tt1 = new Test2();
        // System.out.println(tt1.i + " - " + tt1.str);

        // Test2 tt2 = new Test2();
        // System.out.println(tt2.i + " - " + tt2.str);
    }
}