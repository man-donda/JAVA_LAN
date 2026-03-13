import java.util.*;

class Test3{
    int i;
    String str;
    
    Test3(int i, String str){
        this.i = i;
        this.str = str;
    }
}

public class PARAMETERIZED_CONST {
    public static void main(String[] args) {
        Test3 ttt1 = new Test3(1, "abc");
        Test3 ttt2 = new Test3(2, "pqr");
        System.out.println(ttt1.i + " - " + ttt1.str);
        System.out.println(ttt2.i + " - " + ttt2.str);
    }
}
