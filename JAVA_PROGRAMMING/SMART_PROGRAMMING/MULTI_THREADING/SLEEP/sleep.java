import java.util.*;

// Methods:
// 1. public static native void sleep(long milies) throws InterruptedException
// 2. public static void sleep(long milies, int nano) throws InterruptedException

// Important Notes In Sleep methods:
// 1. If the value of milliseconds is negative then "IllegalArgumentException" is thrown.
// 2. If the value of nanoseconds is not in the range 0-999999 then "IllegalArgumentException" is thrown.
// 3. Whenever we want to use the sleep() method we also need to handle the "InterruptedException". If we will not handle it, the JVM will show a compilation error.
// 4. When any thread is sleeping and if any other thread interrupts it, then it throws "InterruptedException"
// 5. The sleep() method always pauses the current thread execution. When the JVM finds the sleep() method in code, it checks that which thread is running and pause the execution of thread.
// 6. When we use sleep() method to pause the execution of thread. the thread scheduler assigns the CPU to another thread if any thread exists. So, there is no guarantee that the thread wakes up exactly after the time specified in sleep() method. It totally depends on the thread scheduler.
// 7. While the thread is sleeping, it doesn't lose any locks or monitors that it had acquired before sleeping.

public class sleep extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) { // --------
            try {                         //     |
                System.out.print(i + " "); //    |
                Thread.sleep(1000);//    | -- we can't use exception keyword here. we have to
            } catch (Exception e) {     //       |    use try and catch method. 
                System.out.println(e);  //       |
            }                           //--------
        }
    }
    public static void main(String[] args) throws Exception{
        for(int j = 1; j >= 5; j++){
            Thread.sleep(1000);
            System.out.println(j);
        }
    }
}