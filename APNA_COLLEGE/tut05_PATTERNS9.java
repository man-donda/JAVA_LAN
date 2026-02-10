public class tut05_PATTERNS9 {
    public static void main(String[] args){

        for(int i = 1; i < 5; i++){
             for(int s = 1; s < 5 - i; s++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
