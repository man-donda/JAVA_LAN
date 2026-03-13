import java.util.*;

// Definition:
// Abstraction is the process of hiding internal implementation details and showing only the essential features or functionalities to the user.

// Difference between Abstraction and Encapsulation:
// Abstraction: Hides the implementation to show only essential features.
// Encapsulation: Hides the data into single unit to protect it from outside access.

// ---------------- Disadvantages without Abstraction ---------------
//         1. No polymorphism:
//             We can't use a common reference like
//             Vehicle vehicle = new Car();
//         2. Code duplication:
//             Shared logic like displayTyres() must be written in every class
//         3. No method enforcement:
//             Subclasses may forget to implement required methods like start()
//         4. Poor scalability:
//             Harder to maintain or extend code as project grows

abstract class Vehicle
{
    int no_of_tyre;

    void displayTyre(){
        System.out.println("no of tyre: " + no_of_tyre);
    }

    abstract void start();
}

class Car extends Vehicle
{
    void start(){
        no_of_tyre = 4;
        System.err.println("Start with Key");
    }
}

class Scooter extends Vehicle
{
    void start(){
        no_of_tyre = 2;
        System.out.println("Start with kick.");
    }
}

public class ABSTRACTION{
    public static void main(String[] args){
        Vehicle car = new Car(); // polymorphism is not used
        car.start();
        car.displayTyre();

        System.out.println();

        Vehicle scooter = new Scooter();
        scooter.start();
        scooter.displayTyre();
    }
}