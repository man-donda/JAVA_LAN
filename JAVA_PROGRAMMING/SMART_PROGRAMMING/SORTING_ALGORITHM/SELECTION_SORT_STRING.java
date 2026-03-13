import java.util.*;

// Use of compareTo() in String:
// > It compares two strings lexicographically (dictionary order).
// > For example:
// int result = str1.compareTo(str2);
// - Return 0 → If str1 and str2 are equal
// - Return < 0 If str1 is smaller
// - Return > 0 → If str1 is greater

// NOTE: 6 Important points for selection sort:
// 1. Works on searching and sorting:
//    - In each pass, Selection sort searches for the smallest(or largest) element in the unsorted part and then sorts it by placing it in its correct position.
// 2. Two lists - i. Sorted list(left) | ii. Unsorted list(right):
//    - The array is conceptually divided into a sorted part on the left and an unsorted part on the right. With each iteration, the sorted part grows while the unsorted part shrinks.
// 3. Time Complexity: O(n²) 
//    - In selection sort, best, average and worst case time complexities are all n² because it always scans the entire unsorted part in each pass to find the minimum.
//    - Since selection sort always takes n² time regardless of input order, it's inefficient for large datasets & is rarely used in practical projects.  
// 4. Space Complexity: O(1)
//    - Selection sort is in-place. It uses only a constant amount of extra memory (a few variables like 'min' and a 'temp' for swapping).
//    - There is no auxiliary array that grows with n, so auxiliary space = O(1).
// 5. Not Stable:
//    - A sorting algorithm is stable when equal elements keep their original relative order.
// Selection sort is not stable in general because swapping the minimum found from the right with the leftmost unsorted element can reorder equal elements.
// 6. Not Adaptive:
//    - An adaptive algorithm takes advantage of existing order in the input (runs faster if array already partially/fully sorted).


public class SELECTION_SORT_STRING {
    public static void main(String[] args) {
        String arr[] = { "rahul", "deepak", "amit", "bhuppi", "deepesh", "ravi"};
        System.out.println();
        System.out.println("Unsorted array is: ");
        for(String arr1 : arr){
            System.out.print(arr1+" | ");
        }

        for(int i = 0; i < arr.length; i++){  // --- this for loop is for number of passes
            int min = i;
            for(int j = i + 1; j < arr.length; j++){ // --- this for loop is for searching
                if(arr[min].compareTo(arr[j]) > 0){ // -- find the smallest element in the unsorted array
                    min = j;
                }
            }
            String temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.println("\nSorted array is: ");
        for(String arr2 : arr){
            System.out.print(arr2+" | ");
        }
    }
}