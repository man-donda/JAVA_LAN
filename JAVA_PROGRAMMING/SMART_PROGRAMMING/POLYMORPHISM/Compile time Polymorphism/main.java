import java.util.*;

class main{
    
// -------------------------- COMPILE TIME POLYMORPHISM ----------------------- 


    // -------------- Method Overloading -----------------
    //- It is a way (or mechanism or form) to achieve compile-time polymorphism.
    //     Rules of Method Overloading:
    //         1. All overloaded methods must have the same name.
    //         2. All the methods should be in same class.
    //         3. All the method parameters list must be different:
    //             i. Number of parameters
    //             ii. Type of parameters
    //             iii. Order of parameters

    // -------------- different number of parameter -------------- 
    // void m1(int a){
    // System.out.println("the number is " + a);
    // }

    // void m1(int a, int b){
    //     System.out.println("the sum is " + (a+b));
    // }
    // public static void main(String[] args){
    //     main obj = new main();
    //     obj.m1(10);
    //     obj.m1(10,20);
    // }

    // -------------- different parameters --------------------
    // void m1(int a){
    // System.out.println("the number is: " + a);
    // }

    // void m1(String a){
    //     System.out.println("the string is " + a);
    // }
    // public static void main(String[] args){
    //     main obj = new main();
    //     obj.m1(10);
    //     obj.m1("abc");
    // }

    // --------------- order of parameter ------------------
    void m1(int a, String b){
    System.out.println(a+"-"+b);
    }

    void m1(String a, int b){
        System.out.println(a+"-"+b);
    }
    public static void main(String[] args){
        main obj = new main();
        obj.m1(10, "Abc");
        obj.m1("Abc", 10);
    }
}