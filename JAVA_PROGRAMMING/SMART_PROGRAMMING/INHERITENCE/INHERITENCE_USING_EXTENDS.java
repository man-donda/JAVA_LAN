import java.util.*; 

// There are total 5 types of inheritance:
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance (doesnt exists in case of classes) --  we can't use extends method.
// 5. Hybrid Inheritance (doesnt exist in case of classes) -- we have to use interface keyword.

// Advantages of inheritance:
// 1. Code Reusability
// 2. Easy Maintenance
// 3. Polymorphism (Method Overriding)

// Disadvantages of inheritance:
// 1. Tight Coupling
// 2. Increased Complexity


// Does Child class inherits all the properties of Parent class ?
//                           OR
// Which properties from Parent class is not inherited in Child Class ?
//                           ||
//                           \/
// No, private properties & constructor are not inherited in Child class...

class Parents{
    void eyesColour(){
        System.out.println("eyes colour is brown");
    }
}

class Child extends Parents{

}

public class INHERITENCE_USING_EXTENDS{
    public static void main(String[] args) {
       Child c = new Child();
         c.eyesColour();
    }
}

