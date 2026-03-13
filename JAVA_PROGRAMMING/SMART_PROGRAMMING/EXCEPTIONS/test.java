import java.io.FileInputStream;

public class test {
    public static void main(String[] args) {

        // Compile - time Exception :-
        // FileInputStream fis = new FileInputStream("d:/abc.txt");


        // Run - time Exception :-
        String name = null;
        System.out.println(name.length());
    }
}