import java.util.*;

// ------------------------- Using Thread  -------------------------

class Test extends Thread{
    public void run(){
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        // t.start(); // -- throw exceptions cause it is run time error
    }
}
