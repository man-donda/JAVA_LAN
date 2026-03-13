import java.util.*;


// ------------------ Steps of Insertion -------------------
// int[] arr = { 10, 20, 30, 40, 50 }; -- Original Array

// int indexPos = 2; - Index Position where we want to insert the new element
// int ele = 100; - New Element to be inserted

// 1. Create a new Array:
//   - int[] newArr = new int[arr.length + 1]; // Creates an array of integers with a size of 5.

// 2. Copy - paste the elements from old array to new array till indexPos-1 :
//   - for(int i = 0; i < indexPos; i++) {
//           newArr[i] = arr[i];
//       }

// 3. Insert provided element at perticular indexPos:
//   - newArr[indexPos] = ele;

// 4. Copy - paste the pending elements from old array to new array:
//    - for(int j = indexPos; j < arr.length; j++) {
//            newArr[j + 1] = arr[j];
//        }

// 5. Print the new array.
//    -  for(int no2 : newArr){
//             System.out.print(no2+" ");
//         }


public class INSERTION_IN_ARRAY {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Array before insertion:");
        for(int no1 : arr){
            System.out.print(no1+"  ");
        }

        int indexPos = 2;
        int ele = 100;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < indexPos; i++) {
            newArr[i] = arr[i];
        }
        
        newArr[indexPos] = ele;

        for (int j = indexPos; j < arr.length; j++) {
            newArr[j + 1] = arr[j];
        }
        
        System.out.println();
        
        System.out.println("\nNew Array: ");
        for(int no2 : newArr){
            System.out.print(no2+" ");
        }
    }
}