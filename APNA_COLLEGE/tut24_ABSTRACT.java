abstract class animal{

    animal(){
        System.out.println("You are created a new Animal.");
    }

    public void walk(){}
    public void eat(){
        System.out.println("It can eat.");
    }
}

class Horse extends animal{

    Horse(){
        System.out.println("You are created a Horse.");
    }
    public void walk(){
        System.out.println("Walks on 4 Legs.");
    }
}

class Chicken extends animal{

    Chicken(){
        System.out.println("You are created a Chicken.");
    }
    public void walk(){
        System.out.println("Walks on 2 Legs.");
    }
}

public class tut24_ABSTRACT {
    
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.eat();
    }
}
