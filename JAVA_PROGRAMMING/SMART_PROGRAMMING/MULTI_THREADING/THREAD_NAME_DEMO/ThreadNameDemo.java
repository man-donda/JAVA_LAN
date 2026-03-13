import java.util.*;

public class ThreadNameDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        // System.out.println(Thread.currentThread().getName()); // -- for get thread's name
        // Thread.currentThread().setName("man"); // -- for set thread's name
        // System.out.println("New Thread Name: "+Thread.currentThread().getName());
        System.out.println(10/0); // -- throws exception error
    }
}