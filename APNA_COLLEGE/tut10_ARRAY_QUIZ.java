import java.util.*;

public class tut10_ARRAY_QUIZ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter elements : ");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter number which you want to find : ");
        int x = sc.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]==x){
            System.out.println("X found at index number "+ i);
            }
        }
    }
    
}
