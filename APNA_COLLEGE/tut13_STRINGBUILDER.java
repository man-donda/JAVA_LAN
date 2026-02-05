import java.util.*;

public class tut13_STRINGBUILDER {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

    // Print index 0
        System.out.println(sb.charAt(0));
        
    // Insert character in string
        sb.insert(0, 'S'); // sb.insert(Index_number, 'Character');
        System.out.println(sb);

    // Set char at index
        sb.setCharAt(0, 'P'); // sb.setCharAt(Index_number, 'Character');
        System.out.println(sb);

    // Delete characters from string
        sb.delete(0, 1); // sb.delete(Starting_index, Ending_index)
        System.out.println(sb);
        
        sb.delete(2, 3); // convert tony into toy by deleting character 'n'.
        System.out.println(sb);

    // Append - add character at last of the word
        StringBuilder sb1 = new StringBuilder("h");        
        System.out.println("Before append "+sb1);
        sb1.append("e"); //str = str + e; if we are adding for string
        sb1.append("l"); //str = str + l;
        sb1.append("l"); //str = str + l;
        sb1.append("o"); //str = str + o;
        System.out.println(sb1);
        System.out.println("the length of word is "+sb1.length());

    // Reverse word
        
        // Trick-1
        sb1.reverse();
        System.out.println(sb1);

        // Trick-2
       for(int i = 0; i < sb.length()/2; i++){
        int front = i;
        int back = sb.length() - 1 - i;

        char frontchar = sb.charAt(front);
        char backchar = sb.charAt(back);

        sb.setCharAt(front, backchar);
        sb.setCharAt(back, frontchar);
       }
       System.out.println(sb1);
    }
}
 