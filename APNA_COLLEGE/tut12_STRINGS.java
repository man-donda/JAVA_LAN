import java.util.*;

public class tut12_STRINGS {
    public static void main(String args[]){
        // String name = "Tony";
        // System.out.println("Your name is "+name);
        
// ------------------- take input from user --------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // // String name = sc.next(); // it only takes one word from user.
        // String name = sc.nextLine(); // it takes multiple words from user.
        // System.out.println("Your name is "+name);

// ---------------------- string functions ----------------------
        
    // Length
        String firstname = "Tony";
        String secondname = "Stark";
        String fullname = firstname +" "+ secondname; // merge strings
        System.out.println(fullname); 
        System.out.println("The length of the string is "+fullname.length()); // for find length of string. 
      
        
    // Print character one by one
        for(int i = 0; i < fullname.length(); i++){ 
            System.out.println(fullname.charAt(i));  // for print full string's character one by one
        }


    // Compare
        String name1 = "Tony";
        String name2 = "Tony2";

        System.out.println("String 1 is "+name1);
        System.out.println("String 2 is "+name2);
        if(name1.compareTo(name2)==0){  // for doing comparision between 2 strings.
            System.out.println("Both string are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }


    // Sub String
        String sentence = "Tony Stark";
        String sentence1 = sentence.substring(0,4); // it returns sub string from main string
        System.out.println(sentence1);

        
    /*Strings are immutable
            - We can't make a change in the existed string
            - We can't add other things in the existed string 
            - We can't remove or delete other things in the existed string
            - If you want to add or delete something in the string, that's not possible. for that you have to create new string */
    } 
    
}
