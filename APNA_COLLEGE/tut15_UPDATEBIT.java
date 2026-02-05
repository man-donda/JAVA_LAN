import java.util.*;

public class tut15_UPDATEBIT {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int oper = sc.nextInt();
        int bitMask = 1 << pos;

        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n;
            System.err.println(newNumber);
        }

    }
}
