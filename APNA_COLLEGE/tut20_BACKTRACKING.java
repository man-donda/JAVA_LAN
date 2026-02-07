import java.util.*;

public class tut20_BACKTRACKING {
    
    public static void printPermu(String str, String permu, int idx) {
        if(str.length() == 0){
            System.out.println(permu);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            printPermu(newString, permu + currChar, idx);
        }
        
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermu(str, "", 0);
    }
}
