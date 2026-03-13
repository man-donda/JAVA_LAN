import java.util.*;

// 2. Performing sinlge task from multiple thread.

public class Test2 extends Thread {
    public void run(){
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        Test2 thread1 = new Test2();
        thread1.start();

        Test2 thread2 = new Test2();
        thread2.start();

        Test2 thread3 = new Test2();
        thread3.start();
    }
}
