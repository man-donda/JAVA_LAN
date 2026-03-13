import java.util.*;

// Definition:
// Encapsulation is the mechanism of binding data (variables) and actions (methods) into a single unit, called a class.
// Technically, every class is an example of encapsulation.
// However, to create a propertly encapsulated class, we must follow certain rules.

// Rules:
// 1. Declare all variables as private.
// 2. Provide public gatetr and setter methods.

// Use of Encapsulation
// 1. Protects data by hiding it from direct access.
// 2. Controls data access through getters and setters.
// 3. Allows data validation before updating variables.
// 4. Prevents unauthorized or accidental modifications.
// 5. Improves code maintainability and flexibility.

// Data Hiding:
// - It is the concept of restricting access to internal object details to protect data integrity.
// - It is achieved by declaring variables as private and providing controlled access using getter and setter methods.

// Difference between Encapsulation and Abstraction:
// Abstraction: Hides the implementation to show only essential features.
// Encapsulation: Hides the data into single unit to protect it from outside access.

class Car{
    private String brand;
    private int speed;

    void setData(String b, int s){
        brand = b;
        speed = s;
    }

    void printData(){
        System.out.println("Brand - "+ brand);
        System.out.println("Speed - "+ speed);
    }
}

public class ENCAPSULATION{
    public static void main(String[] args){
        Car car = new Car();
        car.setData("BMW", 120);
        car.printData();
    }
}