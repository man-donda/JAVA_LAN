import java.util.*;

// 3. Performing single task from multiple thread.

class myThread extends Thread{
    public void run(){
        System.out.println("Task1");
    }
}

public class Test3 {
    public static void main(String[] args) {
        myThread thread1 = new myThread();
        thread1.start();

        myThread thread2 = new myThread();
        thread2.start();

        myThread thread3 = new myThread();
        thread3.start();
    }
}
