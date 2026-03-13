import java.util.*;

// Defination of a thread:
// Task means a group of multiple little tasks and a thread is a single task of that group of tasks.

// For Example:
// In VlC media player, we have to play a video and music at the same time. So, we can create two threads, one for video and one for music. Both threads will run simultaneously and we can enjoy our media without any interruption.

// Notes:
// Multi threading is best suitable at programming level.
// java provides pre-define API for multi threading. API --> Application Programming Interface. 

//                      Difference between process and thread
//+---------------------+-----------------------------------+---------------------------------------+
//|                     |             Process               |              Thread                   |
//+---------------------+-----------------------------------+---------------------------------------+
//| 1. Defination:      | - A program which is in executing | - It is sub-part of a process. It     |
//|                     |   state is called process.        |   is a single task of a process.      |
//| 2. Weight           | - It is heavy weight.             | - It is light weight.                 |
//| 3. Context Switching| - Takes more time                 | - Takes less time                     |
//| 4. Communication    | - Takes more time                 | - Takes less time                     |
//| 5. Address Space    | - Each process has  different     | - Thread share same address space     |
//|                     |    address space.                 |                                       |
//| 6. Dependency       | - Process are not dependent on    | - Threads are dependent on each others|
//|                     |   each others.                    |                                       |
//| 7. Synchronization  | - Process not require             | - Threads may require synchronization.|
//|                     |   synchronization.                |                                       |
//| 8. Resource         | - Resource Consuption is more in  | - Resource Consuption is less in      |
//|    Consuption       |   Process                         |   threads.                            |
//| 9. Time creation    | - Process reqiures more time for  | - Threads requires less time for      |
//|                     |   creation.                       |   creation.                           |
//| 10. Time for        | - Process reqiures more time for  | - Process reqiures less time for      |
//|     termination     |   termination.                    |   termination.                        |
//+---------------------+-----------------------------------+---------------------------------------+

// There is 2 ways to create Thead:
// 1. Using Thread (class) 
// 2. Using Runnable (Inteface)
// Thread class and Runnable interface are already existed or pre-define in Java.

// Steps:
// 1. Extends the "Thread" class.
// 2. Override the run() method.
// 3. Create an object of the class.
// 4. Start the thread by using start() method.

// Life cycle of Thread:
// 1. Extends the "Thread" class.
// 2. Override the run() method.
// 3. Create/born new thread
// 4. Runnable -- Java will allocate the procesour -- running
// 5. Dead -- When task is complate.
  
class test extends Thread{
    public void run(){
        // task:
    }

    public static void main(String[] args) {
        test t = new test();
        t.start();
    }
}