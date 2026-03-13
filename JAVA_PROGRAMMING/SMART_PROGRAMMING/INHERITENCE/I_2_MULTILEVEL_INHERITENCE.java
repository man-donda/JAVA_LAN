import java.util.*;

    // 2. MULTILEVEL_INHERITENCE:
//                  A
//                  |
//                  B
//                  |
//                  C
// In this type of inheritance, there is a chain of inheritance. A is the parent class of B and B is the parent class of C. So, C is the child class of B and B is the child class of A. Hence, C is the grandchild class of A.

class A2{
    void showA(){
        System.out.println("ShowA method in class A2");
    }
}

class B2 extends A2{
    void showB(){
        System.out.println("ShowB method in class B2");
    }
}

class C2 extends B2{
    void showC(){
        System.out.println("ShowC method in class C2");
    }
}

public class I_2_MULTILEVEL_INHERITENCE{
    public static void main(String[] args) {
        
        A2 obj1 = new A2();
        obj1.showA();

        B2 obj2 = new B2();
        obj2.showB();
        obj2.showA();

        C2 obj3 = new C2();
        obj3.showC();
        obj3.showB();
        obj3.showA();
    }
}