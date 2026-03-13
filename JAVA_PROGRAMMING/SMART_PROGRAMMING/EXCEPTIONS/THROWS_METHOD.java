import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

// "throws" keyword is used to declare an exception. It gives an information to the caller method that there may occur an exception so it is better for the caller method to provide the exception handling code so that normal flow can be maintained.

// FileInputStream class throws "FileNotFoundException" which is compile time exception or checked exception so we have to handle the exception and for this purpose we have to use either try-catch or throws keyword

// throws keyword is used to declare only for the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers fault that he is not performing check up before the code being used.

class ReadandWrite{
    void readFile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("d:/abc.txt");

    }

    void saveFile() throws FileNotFoundException
    {
        String text = " this is demo";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
}

public class THROWS_METHOD {
    public static void main(String[] args) 
    {
        ReadandWrite rw = new ReadandWrite();
        try{
            rw.readFile();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        try{
            rw.saveFile();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

}
