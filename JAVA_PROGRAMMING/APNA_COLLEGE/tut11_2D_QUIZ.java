import java.util.*;

public class tut11_2D_QUIZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of rows and columns : ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of 2-D Array : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Your 2-D array is : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter number which you want to find : ");
        int x = sc.nextInt();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
            if(matrix[i][j]==x){
            System.out.println( x + " found at index number (" +i+","+j+")" );
            }
        }
        }
    }
}
