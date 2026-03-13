import java.util.*;

class test1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " : " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class multi_thread_sleep {
    public static void main(String[] args) {
        test1 t1 = new test1();
        t1.start();
        
        test1 t2 = new test1();
        t2.start();        
    }
}
