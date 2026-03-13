import java.util.*;

interface Animal{
  void eat(); 
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
}

public class INHERITENCE_USING_IMPLEMENTS {
    public static void main(String[] args) {
        Dog buzo = new Dog();
        buzo.eat();
    }
}
