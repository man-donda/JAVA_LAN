import java.util.*; 

//         1. SINGLE_INHERITENCE:
//                     A
//                     |
//                     B
// In this type of inheritance, there is only one parent class and one child class. The child class inherits the properties and behaviors of the parent class.

class A1{
    void showA(){
        System.out.println("ShowA method in class A1");
    }
}

class B1 extends  A1{
    void showB(){
        System.out.println("ShowB method in class B1");
    }
}

public class I_1_SINGLE_INHERITENCE {
    public static void main(String[] args) {
        B1 objB = new B1();
        objB.showA();
        objB.showB();
    }
}
