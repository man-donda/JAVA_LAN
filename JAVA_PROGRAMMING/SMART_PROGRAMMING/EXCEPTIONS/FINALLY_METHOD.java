import java.util.*;

// ------------------ Use ------------------
// - If we use finally method direct after try block then occured exception can't be handle.
// - Always we have to write finally method with try or try-catch method.
// - Without try or try-catch method we can't use finally method.
// - Finally block will always execute even if the exception is occure or not.

// ------------------ Note ------------------
// - We can use finally after try-catch block and also using direct after try block.

// ------------------ Rules ------------------
// - We can also use try-catch method in finally method if we don't have to use throws keyword.
// - We can use multiple catch blocks with single try block but we can only use single finally block with one try block, not multiple.
// - The statement present in the finally block execute even if try block contains control transfer statements(i.e. jump statements like return, break and continue).

/*- The possiblities that disturbs the execution of finally blocks are:    
    Case 1: Using of the System.exit() method.
    Case 2: causing a fatal error that causes the process to abort. 
    Case 3: Due to exception arising in the finally block.
    Case 4: The death of the thread.
*/

/*
  - Syntax of finnaly method:
  - Way 1:                      | - Way 2:
    try{                        |   try{
        risky code              |       risky code
    }                           |   }
    catch(Exception e){         |   finally{
        handling code           |   
    }                           |   }
    finally{                    |
        clean-up code           |
    }                           |
*/

public class FINALLY_METHOD {
    public static void main(String[] args) {
        try{
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);

        }
        // catch(ArithmeticException e){
        //     System.out.println("Exception: "+e);
        // }
        finally{
            System.out.println("I'm in finally block.");
        }
        System.out.println("Hello");
    }
}
