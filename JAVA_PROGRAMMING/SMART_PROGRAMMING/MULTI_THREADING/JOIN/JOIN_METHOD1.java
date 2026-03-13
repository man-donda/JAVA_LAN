import java.util.*;

// In this program thread-0 joins main thread.

class Test extends Thread{
    static Thread mainThread;
    
    public void run() 
    {
        try{
            mainThread.join();
            for(int i = 1; i <= 5; i++){
                System.out.println("Child Thread - "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

public class JOIN_METHOD1 {
    public static void main(String[] args) throws InterruptedException 
    {
        Test.mainThread = Thread.currentThread();
        Test t = new Test();
        t.start();
        // t.join();
        try{
            for(int i = 1; i <= 5; i++){
            System.out.println("Main Thread - "+i);
            Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}