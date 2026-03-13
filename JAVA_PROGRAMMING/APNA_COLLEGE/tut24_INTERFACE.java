interface Animal{
    int eyes = 2;
    void walk();
}

interface Herbivore{

}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 Legs.");
    }
} 

public class tut24_INTERFACE {
    public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
    }
}