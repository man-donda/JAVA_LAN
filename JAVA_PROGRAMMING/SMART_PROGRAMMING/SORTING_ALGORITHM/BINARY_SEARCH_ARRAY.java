import java.util.*;

// What is Sorting ?
// Sorting is the process of arranging the data in a specific order, typically ascending or descending.

// In binary search, the array must be sorted. We will start with the middle element and compare it with the target element. If they are equal, we have found the target element. If the target element is greater than the middle element, we will search in the right half of the array. If the target element is smaller than the middle element, we will search in the left half of the array. We will repeat this process until we find the target element or until we have searched the entire array.

// Time complexity of binary search is Logarithmic because it divides the array into half with each step.
// This means:
// For n = 8 -> max * 3 steps (log_2(8) = 3)
// For n = 16 -> max * 4 steps (log_2(16) = 4)
// Hence, the time complexity is O(log(n)) and this is called logarithmic time complexity.

public class BINARY_SEARCH_ARRAY {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int fi = 0;
        int li = arr.length - 1;
        int ele = 20;
        boolean found = false;

        while (fi <= li) {
            int mi = (fi + li) / 2;
            if (arr[mi] == ele) {
                System.out.println("Found element " + ele + " at " + mi + " index position.");
                found = true;
                break;
            } else {
                if (ele > arr[mi]) {
                    fi = mi + 1;
                } else {
                    li = mi - 1;
                }
            }
        }
        if (!found) {
            System.err.println("Element " + ele + " is not found in the given array.");
        }
    }
}