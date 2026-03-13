import java.util.*;

// Linear search is a very simple search algorithm. In this type of search, a sequential search is made over all items one by one. Every item is checked and if a match is found then that particular item is returned, otherwise the search continues till the end of the data collection.

// A simple approach for linear search is as follows :-
// (arr is array and x is the variable which we have to search in an array)
// 1. Start from the leftmost element of arr[] and one by one compare x With each element of arr[]
// 2. If x matches with an element, print the index position.
// 3. If x doesn't match with an element, print element not found.

// Linear search is rarely used practically because other search algorithms and schemes, such as the binary search algorithm and hash tables allow significantly faster searching for all but short lists of data.

public class LINEAR_SEARCH {
    public static void main(String args[]){


// -------------------   Code for Integer value  -------------------        
        // int arr[] = {5, 3, 6, 1, 4, 2};
        // int ele = 40;
        // boolean isFound = false;

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == ele){
        //         System.out.println("Element is present at "+i+" index position");
        //         isFound = true;
        //     }
        // }
        //  if(!isFound){
        //     System.out.println("Element is not exists in the array");
        //  }



// -------------------- Code for String Value --------------------
            String arr[] = {"deepak", "rohit", "rahul", "deepesh", "vironica", "amit"};
            String ele = "jatin ";
            boolean isFound = false;

            for(int i = 0; i < arr.length; i++){
                if(arr[i].equals(ele)){
                    System.out.println("Element is present at "+i+" index position");
                    isFound = true;
                }
            }
            if(!isFound){
                System.out.println("Element is not exists in the array");
            }
            
                    
    }
}