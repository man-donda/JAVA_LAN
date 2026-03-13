import java.util.*;

    // --------------- Method Overriding -------------- 
    // It is a way (or mechanism or form) to achieve runtime polymorphism.
    // - Rules of Method Overriding:
    //     1. All overloaded methods must have the same name.
    //     2. All the methods should be in different class.
    //     3. All the method parameters list must be same:
    //         - Number of parameters
    //         - Type of parameters
    //         - Order of parameters
    //     4. Should follow IS-A Relationship (Inheritance)


    // Use of Runtime Polymorphism or Method Overriding
    // -It is used to change the parent class method definition in the child class.

    //We cannot override below methods :-
        // 1. Static Methods
        // - Static methods belong to class, not instance, so not overridden.
        // 2. Private Methods
        //     - Private methods are not visible to child classes, so not overridden.
        // 3. Final Methods
        //     - Final methods cannot be changed by child classes, so not overridden.

class A1{
    void m1(){ 
    System.out.println("m1 method call in class A1");
    }
}

class B1 extends A1{
    @Override
    void m1(){
        System.out.println("m1 method call in class B1");
    }
}

class runtime{
    public static void main(String[] args) {
        A1 obj = new B1();
        obj.m1();
    }
}