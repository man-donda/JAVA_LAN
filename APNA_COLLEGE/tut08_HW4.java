import java.util.*;

// Write a function that takes in the radius as input and returns the circumference of a circle.

public class tut08_HW4 {

    public static float findArea(float r){
        float area = 2 * 3.14f * r;
        System.out.println("The circumference of a circle is "+ area);
        return area;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        float r = sc.nextFloat();

        findArea(r);
    }   
}
