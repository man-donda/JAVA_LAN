import java.util.*;

// Inter-thread Communication :-
// Inter-thread communication is a mechanism in which a thread releases the lock and enter into paused state and another thread acquires the lock and continue to executed.


// It is implemented by following methods of Object class:
// 1. wait(): If any thread calls the wait() method, it causes the current thread to release the lock and wait until another thread invokes the notify() or notifyAll() method for this object, or a specified amount of time has elapsed.
// Syntax: public final void wait() throws InterruptedException (waits until object is notified)
//         public final void wait(long timeout) throws InterruptedException (waits for the specified amount of time)

// 2. notify(): This method is used to wake up a single thread and releases the object lock
// Syntax: public final void notify()

// 3. notifyAll (): This method is used to wake up all threads that are in waiting state.
// Syntax: public final void notifyAll()

// NOTE: To call wait(), notify() or notifyAll() method on any object, thread should own the lock of that object i.e. the thread should be inside synchronized area

public class INTER_THREAD_COMM {
    
}
