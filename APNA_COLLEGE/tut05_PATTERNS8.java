public class tut05_PATTERNS8 {
    public static void main(String[] args){

        int number = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number += 1;
            }
            System.out.println();
        }
    }
}