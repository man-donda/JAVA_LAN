import java.util.*;

// There are three ways to create Strings in Java :
// 1. String
// 2. StringBuffer
// 3. String Builder

// Note :
// Main difference between String and StringBuffer is String onjects are immutable but StringBuffer objects are mutable.

// When we should use String and StringBuffer?
// If the data does not change or change one or two times only, use String.
// If data is constantly or friquently changing like in calculator, notepad etc. We should use StringBuffer.

// Synchronization in Java guarantees that no two threads can execute a synchronized method which requires the same lock simultaneously or concurrently. And thus, synchronization increases waiting time of thread and effects performance of the system.

// To overcome the problem of slow performance of StringBuffer methods, Java introduced StringBuilder concept in JDK 1.5 version and creates all the methods of StringBuilder as non-synchronized which increases the methods performance.

// When we have to use String, StringBuffer and StringBuilder:
// String : When you do not want to change anything, make constant value and want to create immutable (we can not 
//          change it) objects that time we can use String.
// StringBuffer: When we have to create thread safety, Synchronize and mutability(we can change it) object that time we  
//               can use StringBuffer.
// StringBuilder: When we have to create non-Synchronize(not thread safety), good performance and mutability object that 
//                time we can use StringBuilder.

public class STRING_THEORY{
    public static void main(String[] args) {
           
    }
}