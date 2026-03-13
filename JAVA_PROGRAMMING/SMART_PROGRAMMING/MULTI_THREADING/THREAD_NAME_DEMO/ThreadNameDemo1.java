import java.util.*;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread Task: "+Thread.currentThread().getName()); // return by default thread name - Thread-0
    }
}

public class ThreadNameDemo1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName()); // return main
        System.out.println(Thread.currentThread().isAlive()); // return true cause main thread is still alive

        Thread1 th1 = new Thread1();
        th1.setName("ABC"); // Set new name of the Thread
        th1.start();
        System.out.println(th1.isAlive());
        
        Thread1 th2 = new Thread1();
        th2.setName("XYZ");
        th2.start();
    }

}
