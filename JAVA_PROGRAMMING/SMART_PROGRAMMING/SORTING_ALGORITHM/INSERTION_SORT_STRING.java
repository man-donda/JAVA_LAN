import java.util.*;

public class INSERTION_SORT_STRING {
    public static void main(String[] args) {
        String[] arr = {"deepak", "kamal", "amit", "deepesh", "rahul", "ravi"};

        System.out.println("Unsorted array is: ");
        for(String no1 : arr){
            System.out.print(no1+" | ");
        }

        for(int i = 1; i < arr.length; i++){
            String temp = arr[i];
            int j = i - 1;
            while(j >= 0  && arr[j].compareTo(temp) > 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println();
        System.out.println("\nSorted array is: ");
        for(String no2 : arr){
            System.out.print(no2+" | ");
        }
    }
}
