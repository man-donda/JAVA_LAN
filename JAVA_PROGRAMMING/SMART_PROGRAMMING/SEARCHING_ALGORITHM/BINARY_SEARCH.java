import java.util.*;

// What is Sorting ?
// Sorting is the process of arranging the data in a specific order, typically ascending or descending.

// In binary search, the array must be sorted. We will start with the middle element and compare it with the target element. If they are equal, we have found the target element. If the target element is greater than the middle element, we will search in the right half of the array. If the target element is smaller than the middle element, we will search in the left half of the array. We will repeat this process until we find the target element or until we have searched the entire array.

// Binary Search is the process of searching an element from sorted array by repeatedly dividing the search interval in half.
// Binary search is faster than linear search.
// Although Binar Search is a very optimised way of searching a particular element but the Array must be sorted on which you want to perform the search process.
// If the Array is not sorted in advance then we have to perform sorting first and then only we can perform binary search on that.

public class BINARY_SEARCH {
    public static void main(String[] args) {

        // ------------------- Code for Integer value -------------------
        // int arr[] = {1, 2, 4, 5, 7, 8, 9};
        // int ele = 9;
        // int li = 0;
        // int hi = arr.length - 1;
        // int mi = (li + hi) / 2;
        // boolean isFound = false;

        // while(hi >= li){
        // if(arr[mi] == ele){
        // System.out.println("Element "+ele+" presents on "+mi+" position");
        // isFound = true;
        // break;

        // }
        // else if(arr[mi] < ele){
        // li = mi + 1;
        // }
        // else{
        // hi = mi - 1;
        // }
        // mi = (li + hi) / 2;
        // }
        // if(!isFound){
        // System.out.println("Element "+ ele +" is not exists in the array");
        // }

        // ------------------- Code for String value -------------------
        String arr[] = { "deepak", "rahul", "rohit", "deepesh", "vironica", "amit" };
        String ele = "deepesh";
        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + li) / 2;
        boolean isFound = false;

        while (li <= hi) {

            if (arr[mi].equals(ele)) {
                System.out.println("Element " + ele + " presents on " + mi + " position");
                isFound = true;
                break;
            } else if (arr[mi].compareTo(ele) < 0) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (!isFound) {
            System.out.println("Element " + ele + " is not exists in the array");
        }
    }
}
