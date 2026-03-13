import java.util.*;

// Logic for Selection Sort
// 1. Start with the first element and find the minimum element from the right side of the list.
// 2. Swap the minimum element with the first element of the unsorted part.
// 3. Now the list is divided into two parts:
//    - Sorted part (at the beginning)
//    - Unsorted part (remaining elements)
// 4. Take the first element of the unsorted part (next position) and repeat the process.
// 5. Continue until the entire list is sorted.

public class SELECTION_SORT_INT { 
    public static void main(String[] args) {
        int arr[] = { 49, 74, 25, 36, 88, 18, 31};
        System.out.println("Unsorted array is: ");
        for(int arr1 : arr){
            System.out.print(arr1+" ");
        }

        for(int i = 0; i < arr.length; i++){  // --- this for loop is for number of passes
            int min = i;
            for(int j = i + 1; j < arr.length; j++){ // --- this for loop is for searching
                if(arr[min] > arr[j]){ // -- find the smallest element in the unsorted array
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.println("\nSorted array is: ");
        for(int arr2 : arr){
            System.out.print(arr2+" ");
        }
    }
}
