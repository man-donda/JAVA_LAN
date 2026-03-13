import java.util.*;
public class tut07_FUNCTIONS {

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String a = sc.next();
        printMyName("Your name is "+a);
    }
}
