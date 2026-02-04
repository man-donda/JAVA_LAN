public class tut05_PATTERNS10 {
    public static void main(String[] args){

        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                if(j==1 || j==8 || i==4 || i==5 || (i==2 && (j==2 || j==7)) || (i==7 && (j==2 || j==7)) || (i==3 && (j==2 || j==3 || j==6 || j==7)) || (i==6 && (j==2 || j==3 || j==6 || j==7)) ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
