import java.util.*;

// Logic of "Insertion Sort":
// 1. Start from the second element (index 1), because the first element (index 0) is already "sorted" by itself.
// 2. Take the current element (called key) and compare it with the elements before it.
// 3. Shift all larger elements one position to the right to make space for the key.
// 4. Insert the key into its correct position in the sorted part of the array.
// 5. Repeat this process for every element until the whole array is sorted.

// Steps to sort the list using "Insertion Sort":
// 1. Take 30 (2nd element):-
// -> Compare with 50 → since 30 < 50 → insert before 50.
// -> List becomes: [30, 50, 10, 40, 20]
// 2. Take 10 (3rd element):-
// -> Compare with 50 → 10 < 50 → shift 50 [30, 50, 50, 40, 20]
// -> Compare with 30 → 10 < 30 shift 30 → [30, 30, 50, 40, 20]
// -> Now insert 10 at beginning.
// -> List becomes: [10, 30, 50, 40, 20]
// 3. Take 40 (4th element):-
// -> Compare with 50 → 40 < 50 → shift 50 [10, 30, 50, 50, 20]
// -> Compare with 30 → 40 > 30 → stop here.
// -> Insert 40 after 30.
// -> List becomes: [10, 30, 40, 50, 20]
// 4. Take 20 (5th element):-
// -> Compare with 50 → 20 < 50 → shift 50 → [10, 30, 40, 50, 50]
// -> Compare with 40 → 20 < 40 → shift 40 [10, 30, 40, 40, 50]
// -> Compare with 30 → 20 < 30 → shift 30 [10, 30, 30, 40, 50]
// -> Compare with 10 → 20 > 10 → stop here.
// -> Insert 20 after 10.
// List becomes: [10, 20, 30, 40, 50]

// Time Complexity of Insertion Sort:
// 1. Best Case - Ω(n) → When the array is already sorted
// 2. Average Case - O(n²) → When the array is in random order
// 3. Worst Case - O(n²) → When the array is sorted in reverse order

// Space Complexity of Insertion Sort: O(1) → Because it sorts the array in-place using only a constant amount of extra space (just a few variables for key, j, and temp).

// Stability of Insertion Sort: Stable → Because it does not change the relative order of equal elements. If two elements are equal, they will remain in the same order as they were in the input array after sorting.

// Adaptive Nature of Insertion Sort: Adaptive → Because it takes advantage of existing order in the input. If the array is already partially sorted, Insertion Sort can run faster than O(n²) and approach O(n) in the best case.

public class INSERTION_SORT_INT {
    public static void main(String[] args) {
        int[] arr = { 50, 30, 10, 40, 20 };

        System.out.println("Unsorted array is: ");
        for(int no1 : arr){
            System.out.print(no1+" ");
        }

        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0  && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println();
        System.out.println("\nSorted array is: ");
        for(int no2 : arr){
            System.out.print(no2+" ");
        }
    }
} 