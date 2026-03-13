import java.util.*;

interface printable {
    void print();
}

class document implements printable {
    public void print() {
        System.out.println("Document printed");
    }
}

class image implements printable {
    public void print() {
        System.out.println("Image printed");
    }
}

public class EXAMPLE_1 {
    public static void main(String[] args) {
        document doc = new document();
        doc.print();

        image img = new image();
        img.print();
    }
}
