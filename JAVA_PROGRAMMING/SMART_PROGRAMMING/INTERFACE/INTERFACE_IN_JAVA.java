import java.util.*;

// Definition:
// Interfaces are similar to abstract class but having all the methods of abstract type.
// It declares what should be done, not how.

// Difference between Abstract class and Interface:
// - An abstract class can have both abstract and concrete methods
// - while an interface contains only abstract methods

// Note:
// In Interface we can't implement methods in interface class.
// Java 8 introduced default and static methods in interfaces, and Java 9 Introduced private methods, allowing method implementations
// - Interface can imherit another interface using extends keyword.
// - Interface never inherit the property of class but class can inherit the property of interface using implements keyword.

// Syntax:
// interface InterfaceName
// {
//    public static final variables (constants)
//    public abstract methods
// }

// Use of Interface
// 1. Used to achieve 100% abstraction in Java.
// 2. Used to define a common behaviour across unrelated classes.
// 3. Used to achieve multiple inheritance in Java.
// 4. Used to achieve loose coupling in our code.
// 5. Used extensively in frameworks, APIs, and design patterns (e.g., DAO, Service Layer).

interface I1{
    void pay();

    void m2();
}

class UpiPayment1 implements I1{
    public void pay(){
        System.out.println("Paying with UPI");
    }

    public void m2(){

    }
}

public class INTERFACE_IN_JAVA {
    public static void main(String[] args) {
        
    }
}
