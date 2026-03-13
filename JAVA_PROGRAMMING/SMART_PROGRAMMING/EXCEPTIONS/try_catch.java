import java.util.*;

/*  
  ------------------ Note ------------------ 
  - catch class must be declare with try class. try and catch class always write togather.
  - we can handle our risky code by using try-catch and compile successfully.
  // - We can use multiple catch blocks with single try block.
    
  - Syntax of try-catch:

    try{
        risky code - in which code there is a possiblity to get error.
    }
    catch(ExceptionClassName ref.var.name){
        handling code - this code is write for handle the occured exception.
    }
*/

/*
  - There are three ways to print exception in catch block.
    1. e.printStackTrace(); 
    
    2. System.out.println(e); 
                or 
       System.out.println(e.toString());
    
    3. System.out.println(e.getMessage());
*/

// In this program we handle exception through using try and catch method.

public class try_catch {
    public static void main(String[] args) {
        
        try{
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e) // exception
        {
            e.printStackTrace();
                // or
            System.out.println("\n"+ e);
            System.out.println("\n"+ e.toString());
                // or
            System.out.println("\n"+ e.getMessage());
                // or    
            System.out.println("\nyou can't divide by zero");
        }
    }
}
