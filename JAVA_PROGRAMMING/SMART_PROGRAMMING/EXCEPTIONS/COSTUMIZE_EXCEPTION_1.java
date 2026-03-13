import java.util.*;

// ----------------------------------- Compile - time Exception -----------------------------------

class underAgeException extends Exception{
    underAgeException(){
        super("You are under age");
    }
    underAgeException(String msg){
        super(msg);
    }
}

public class COSTUMIZE_EXCEPTION_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try{
            if(age<18){
                throw new underAgeException("You can not vote as your age is below 18.");
            }else{
                System.out.println("You can Vote.");
            }
        }catch(underAgeException e){
            e.printStackTrace();
        }
    }
}