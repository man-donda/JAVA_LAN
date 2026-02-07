import java.util.*;

public class tut18_SET_CHAR_AT_END {
    public static void setCharX(String str, int idx, int count, String newString){
        if(idx==str.length()){
        for(int i = 0; i < count; i++){
            newString += 'x';
        }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            setCharX(str, idx+1, count, newString);
        }else{
            newString += currChar;
            setCharX(str, idx+1, count, newString);
        }
    }
    
    public static void main(String[] args) {
        String str = "axbcxxd";
        setCharX(str, 0, 0, "");
    }
}