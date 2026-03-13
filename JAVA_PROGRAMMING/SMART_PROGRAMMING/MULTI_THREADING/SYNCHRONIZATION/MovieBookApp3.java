import java.util.*;

class totalEarning extends Thread {

    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();  
        }
    }
}

public class MovieBookApp3 {
    public static void main(String[] args) throws InterruptedException{

        totalEarning te = new totalEarning();
        te.start();
        synchronized(te){
            te.wait();
            System.out.println("Total earning : " + te.total + " rs.");
        }
    }
}
