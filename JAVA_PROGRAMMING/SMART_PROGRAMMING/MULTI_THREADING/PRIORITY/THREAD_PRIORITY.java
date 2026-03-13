import java.util.*;

// Notes:
// 1. JVM provides priorities to each thread and according to this priorities, JVM allocates the processor
// 2. Priorities are represented in the form of integer values which ranges from 1 to 10.
//  * i.   1  -> MIN_PRIORITY
//    ii.  5  -> NORM_PRIORITY  
//    iii. 10 -> MAX_PRIORITY 
//  * Below are not the priority:
//    0, <1, >10            ---------
//    MINIMUM_PRIORITY              | 
//    LOW_PRIORITY                  |    \  /
//    MEDIUM_PRIORITY               |---  \/    none of this are existed in priority
//    NORMAL_PRIORITY               |     /\ 
//    MAXIMUM_PRIORITY              |    /  \
//    HIGH_PRIORITY         ---------

// 3. Methods: 
//    i. public final void setPriority(int value)
//    ii. public final int getPriority()

// 4. Default nature: Priorities are inherited from parent thread.

// 5. By default main thread's priority is 5.

// 6. If priority value is not between 1 to 10 then it will throws run-time exception. 
//    i.e: IlligalArgumentException

// 7. Prioritiea are depands on the plateform(windows does not supports priorities).

class Test extends Thread{
    public void run(){
        System.out.println("Child Thread");
        System.out.println("Child thread priority: "+Thread.currentThread().getPriority());    
    }
}

public class THREAD_PRIORITY{
    public static void main(String[] args) {    
        System.out.println("Main Thread");
        System.out.println("Main thread's priority: "+Thread.currentThread().getPriority()); 
        Thread.currentThread().setPriority(10);    
        System.out.println("Main thread's updated priority:"+Thread.currentThread().getPriority()); 
        Test t1 = new Test();
        t1.setPriority(7);
        t1.start();
    }
}