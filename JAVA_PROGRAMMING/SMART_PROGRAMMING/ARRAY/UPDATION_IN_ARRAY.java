import java.util.*; 

public class UPDATION_IN_ARRAY {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int indexPos = 2;
        int Ele = 100;

        System.out.println("Array before updation:");
        for(int no1 : arr){
            System.out.print(no1+" ");
        }

        arr[indexPos] = Ele;
        System.out.println();

        System.out.println("\nArray after updation:");
        for(int no2 : arr){
            System.out.print(no2+" ");
        }
    }
}
