import java.util.*;

public class CONCEPT_OF_ARRAY {
    public static void main(String[] args) {
        
        // int arr[]; // Declaration
        // arr = new int[3]; // Creation

        // int[] arr = new int[3]; // Declaration and Creation in one line

        // // Initialization
        // arr[0] = 101;
        // arr[1] = 102;
        // arr[2] = 103; 

        // Declaration, Creation and Initialization in single line
        int[] arr= {101, 102, 103}; 

        // Retrieving using for loop:
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // Retrieving using for each loop:
        for(int no : arr){
            System.out.println(no);
        }
    }
}
