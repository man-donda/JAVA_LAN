import java.util.*;

// 1. Performing sinlge task from single thread.

public class Test1 extends Thread{
    public void run(){
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        Test1 thread1 = new Test1();
        thread1.start();
    }
}