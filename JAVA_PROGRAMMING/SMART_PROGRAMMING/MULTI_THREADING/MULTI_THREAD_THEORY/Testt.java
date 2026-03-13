import java.util.*;

// ----------------------- Using Runnable --------------------------

public class Testt implements Runnable{

    @Override
    public void run(){
        System.out.println("Thread Task 2");
    }

    public static void main(String[] args) {
        Testt t = new Testt();
        Thread th = new Thread(t);
        th.start();
    }
}
