import java.util.*;

// defination: join() - If a thread wants to wait another thread to complate its task, then we should use join() method.

// Example - Licence

// Methods:
// a. punlic final void join() throws exception
// b. public final synchronize void join (long ms) throws exception
// c. public final synchronize void join (long ms, int ns) throws exception

class Test extends Thread{
    public void run(){
        try{
            for(int i = 1; i <= 5; i++){
            System.out.println("Child Thread - "+i);
            Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

public class JOIN_MATHOD{
    public static void main(String[] args) throws InterruptedException 
    {
        Test t = new Test();
        t.start();
        t.join();
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