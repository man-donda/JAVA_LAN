import java.util.*;

// Defination: Yield() - which stops the current executing thread and give a chance to other thread for execution.

// Working:
// In java5 it used sleep()
// In java6 thread provides the hint to the thread scheduler,  then it depands on thread-schedular to accept on ignore the hint.

// Method:
// public static native void yield()

// Output maybe diffetent

class Test extends Thread{
    public void run(){
        for(int i = 0; i <= 5; i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}

public class YIELD_THEORY{
    public static void main(){
        Test t = new Test();
        t.start();

        for(int i = 0; i <= 5; i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}