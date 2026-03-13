import java.util.*;

public class SEARCHING_IN_ARRAY {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int ele = 20;
        boolean isFound = false;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                System.out.println("Element found at index: "+i);
                isFound = true;
                break;
            }
        }
        if(isFound == false){
            System.out.println("Element not found in the array.");
        }
    }
}
