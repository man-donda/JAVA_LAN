import java.util.*;

// What is Sorting ?
// Sorting is the process of arranging the data in a specific order, typically ascending or descending.

// NOTE:
//  - If the list is small, then Bubble sort, Selection sort and Insertion sort are good to use as they are simple and easy to implement. 
//  - If the list is large, then Merge sort, Quick sort and Heap sort are good to use due to their better performance and efficiency.
//  - In bubble sort, The total number of the passes are total number of elements - 1. In each pass, the largest unsorted element is moved to its correct position at the end of the list.

// According to given list:
// int arr[] = {55, 32, 44 , 25, 16};
//   - In the first pass, the largest element is place at the last position.
//   - In second pass, the second largest element is placed at second last position.
//   - Like this, in each pass of Bubble Sort, the largest unsorted element moves to its correct position at the end of the list. 

// -> Time Complexity :
// 1. Best Case - Ω(n)
// 2. Average Case - O(n²)
// 3. Worst Case - O(n²)
// -> Space Complexity: 0(1)

//--> Space Complexity of Bubble Sort: 0(1)
//    Because it sorts the array in-place using only a constant amount of extra space (just a few variables for swapping and looping).

// Time-Complexity of Bubble Sort:
// -> The best case for Bubble Sort occurs when the list is already sorted.
// -> In this case, Bubble Sort completes in just one pass without any swaps, and the time complexity is Ω(n) (Big Omega of n).
//--> Average Case:
//    When elements are in random order, Bubble Sort performs about n/2 swaps per pass over n passes.
//    So, the average time complexity is O(n²) due to many comparisons and swaps
//--> Worst Case:
//    When the list is in reverse order, every element needs to be moved to the correct position.
//    This results in the maximum number of comparisons and swaps, giving a time complexity of O(n²).

public class BUBBLE_SORT_ALGO {
    public static void main(String[] args) {
        int arr[] = { 55, 32, 44, 75, 11, 68, 25, 16 };

        System.out.println("Unsorted array is: ");
        for (int arr1 : arr) {
            System.out.print(arr1 + " ");
        }

        int len = arr.length;
        int temp = 0;

        for (int i = 1; i < len; i++) { // --- this for loop is for number of passes
            boolean swapped = false;
            for (int j = 0; j < len - i; j++) { // --- this for loop is for treiverse the array
                if (arr[j] > arr[j + 1]) { // --- Compare two adjacent elements.
                    temp = arr[j];       //  ----|
                    arr[j] = arr[j + 1]; //      |---- Swapping elements.
                    arr[j + 1] = temp;   //  ----|
                    swapped = true;
                }
            }
            if (swapped == false) { // --- If no swapping occurs, the array is already sorted.
                break;
            }
        }
        System.out.println();
        System.out.println("\nSorted array is: ");
        for (int arr2 : arr) {
            System.out.print(arr2 + " ");
        }
    }
}