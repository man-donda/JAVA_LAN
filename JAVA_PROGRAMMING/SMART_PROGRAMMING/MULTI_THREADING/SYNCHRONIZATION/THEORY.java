import java.util.*;

// 1. What is Synchronization?
// -> It is the process by which we control the accessibility of multiple threads to a particular shared resource

// 2. Problem which can occur without synchronization:-
// -> i. Data Inconsistancy
// -> ii. Thread interference

// 3. Advantages of Synchronization :-
// -> i. No data inconsistancy problem
// -> ii. No thread interference

// 4. Disadvantages of Synchronization :-
// -> i. Increases the waiting time period of threads
// -> ii. Create performance problems

// Note:
// To overcome synchronization disadvantages, java provides one package.
// i.e :- java.util.concurrent

// How to achieve synchronization:- 

//                                Types of Synchronization
//                                            |
//                                            |
//                       --------------------/ \-------------------- 
//                       |                                         |
//                       |                                         | 
//            Process Synchronization                     Thread Synchronization
//            (not present in java                                 |
//             multithreading)                                     |
//                                                ----------------/ \----------------
//                                                |                                 | 
//                                                |                                 |  
//                                        Mutual Exclusive                     Cooperation
//                                - Can be achieved by 3 ways:-        (inter-thread communication
//                                1. by "Synchronized Method"           in java)
//                                2. by "Synchronized Block"           - Can be achieved by following
//                                3. by "Static Synchronized"            Methods of object class:-
//                                                                       1. wait()
//                                                                       2. notify() 
//                                                                       3. notifyAll()
                                                
public class THEORY {
    
}


 
                                                                      
                                                                    
                                                                    
                                                                    