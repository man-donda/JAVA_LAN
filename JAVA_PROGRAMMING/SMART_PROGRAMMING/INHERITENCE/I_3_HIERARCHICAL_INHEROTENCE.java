import java.util.*;

    // 3. HIERARCHICAL_INHEROTENCE:
//                  A
//                 / \
//                /   \
//               B     C
// In this type of inheritance, there is one parent class and multiple child classes.

class A3{
    void showA(){
        System.out.println("ShowA method in class A3");
    }
}

class B3 extends A3{
    void showB(){
        System.out.println("ShowB method in class B3");
    }
}

class C3 extends A3{
    void showC(){
        System.out.println("ShowC method in class C3");
    }
}

public class I_3_HIERARCHICAL_INHEROTENCE {
    public static void main(String[] args) {
        
        A3 obj1 = new A3();
        obj1.showA();

        B3 obj2 = new B3();
        obj2.showB();
        obj2.showA();

        C3 obj3 = new C3();
        obj3.showC();
        obj3.showA();

    }
}
