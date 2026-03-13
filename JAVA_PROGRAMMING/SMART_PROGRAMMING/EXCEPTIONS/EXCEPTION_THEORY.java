import java.util.*;

// Defination : An exception is an unwanted or unexpected event, which occurs during the execution of a program. i.e at run time, that disrupts the normal flow of the program.
// - exception is the parent class of all the exception class.

// Whenever there is exception, themethod in which exception occurs will create an object and that object will store 3 things:
// 1. Exception Name 
// 2. Description 
// 3. Stack Trace

// We can handle the exception using 5 keywords:
// 1. try 
// 2. catch
// 3. finally
// 4. throw
// 5. throws


/*
                                    JVM (Exception name, Decription, stack trace(line))
                                     |
                            No      / \     Yes
                        -----------|   |-----------
                       |                           | 
                       |                           | 
            Default Exception Handler       Manually Handle(Using try-catch)
                       |
                       |
                     Print 
*/

/*
  - There are three ways to print exception.
    1. e.printStackTrace(); 
    
    2. System.out.println(e); 
                or 
       System.out.println(e.toString());
    
    3. System.out.println(e.getMessage());
*/

// ------------------------ Important Points to Note --------------------------
/*
  1. keywords working :
   - try: In try block we write statements that can throw exception i.e. it mentains risky code
   - catch: It mentains exception handling code i.e. alternative way for exception
   - finally: It mentains clean up code i.e. closing the resources
   - throw: It creates exception object manually (by programmer) and handover to JVM
   - throws: It is used to declare the exception. It gives an information to the caller method that there may occur an exception so it is better for the caller method to provide the exception handling code so that normal flow can be maintained.
   
  2. If we call a method that declares an exception, we must either caught the exception using try catch block or declare the exception using throws keyword or say If there is any checked exception, we will get compile time error saying "unreported exception XXX must be caught or declared to be thrown". 
   - To prevent this compile time error we can handle the exception in two ways:
      1. By using try catch
      2. By using throws keyword

  3. throws keyword used to declare the checked exceptions only. If there occurs any unchecked exception such as NullPointerException, it is programmers fault that he is not performing check up before the code being used.
*/

public class EXCEPTION_THEORY{
    public static void main(String[] args){

    }
}