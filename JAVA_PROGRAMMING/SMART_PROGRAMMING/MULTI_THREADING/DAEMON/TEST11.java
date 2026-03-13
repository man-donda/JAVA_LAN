import java.util.*;

// Defination: Daemon - Which Runs of the background of the another thread.
// Use :  

// Important Notes:
// Case 1: We have to create Daemon thread before starting the Thread, If we create Deamon thread after starting it, it will throw run time exception. 
// i.e: Illigalthreadstateexception 
// Case 2: We cannot create main thread as main thread.

// E.g:- garbage collector, Finalizer, Attach listener, Signal dispatcher etc.

// Methods: 
// i. public final void setDaemon(boolean b)
// ii. public final boolean isDaemon();

// Note: Its life depands on another Thread.

// Daemon nature: It inherite the nature/property from its parent thread.

// Priority: Most of the times Daemon thread has low priority, but we can change its priority according to our needs.

// Program:

class TEST11 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
        System.out.println("Demon thread");
        }else{
            System.out.println("Child tread");
        }
    }

    public static void main(String[] args) throws Exception
    {

        // Thread.currentThread().setDaemon(true); // it throws exception cause we cant change the value of the main thread's Daemon.
        System.out.println("Main thread");
        TEST11 t11 = new TEST11();
        t11.setDaemon(true);
        t11.start();    
        // Thread.sleep(1000);
    }
}