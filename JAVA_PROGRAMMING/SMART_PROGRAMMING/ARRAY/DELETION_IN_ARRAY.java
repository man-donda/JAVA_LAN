import java.util.*;

public class DELETION_IN_ARRAY {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("Array before deletion:");
        for (int no1 : arr) {
            System.out.print(no1 + "  ");
        }

        int indexPos = 1;

        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == indexPos){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }

        // another way:
        // for(int j = indexPos; j < arr.length - 1; j++){
        //     newArr[j] = arr[j + 1];
        // }

        System.out.println();
        System.out.println("\nNew array after deletion:");
        for(int no2 : newArr){
            System.out.print(no2+" ");
        }
    }
}