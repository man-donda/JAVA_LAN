import java.util.*;

// There are three ways to create Strings in Java :
// 1. String
// 2. StringBuffer
// 3. String Builder

// Note :
// Main difference between String and StringBuffer is String onjects are immutable but StringBuffer objects are mutable.

// When we should use String and StringBuffer?
// If the data does not change or change one or two times only, use String.
// If data is constantly or friquently changing like in calculator, notepad etc. We should use StringBuffer.

// Synchronization in Java guarantees that no two threads can execute a synchronized method which requires the same lock simultaneously or concurrently. And thus, synchronization increases waiting time of thread and effects performance of the system.

// To overcome the problem of slow performance of StringBuffer methods, Java introduced StringBuilder concept in JDK 1.5 version and creates all the methods of StringBuilder as non-synchronized which increases the methods performance.

public class STRING_THEORY{
    public static void main(String[] args) {


        // ------------------------------ StringBuffer --------------------------------
        
        // capacity (to find capacity):
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());      // 16

        // append (to add character):
        sb.append("Hello");
        System.out.println(sb.capacity());      // 16

        sb.append("world, javaa");          // If string becomes more than 16 character then it counts like __
        System.out.println(sb.capacity());      // (old capacity*2)+2 = (16*2)+2 = 34                          <--'     
                                                                                                    
        // length (to find the length of the StringBuffer):
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1.length());       // 5

        // charAt(it returns the character at given index position) :
        System.out.println(sb1.charAt(3));  // l

        // delete :
        System.out.println(sb1.delete(1, 3)); // Hlo

        //deleteCharAt (delete a character of given index position):
        System.out.println(sb1.deleteCharAt(1)); //Ho

        // equals:
        StringBuffer sb2 = new StringBuffer("Ho");
        System.out.println(sb1.equals(sb2));    // false 
            // StringBuffer class does not override equals method of Object class but String class override the equals method of Object class 
        StringBuffer sb3 = sb2.append("world");            //  .----------.     
        System.out.println("sb2: "+sb2);                        // |  Howorld  | ___.---> sb2  
        System.out.println("sb3: "+sb3);                        // '-----------'    '---> sb3 
        System.out.println(sb3.equals(sb2));    // true           

        // indexOf (returns index of given character):
        StringBuffer sb4 = new StringBuffer("Hello");
        System.out.println(sb4.indexOf("l"));   // 2 

        // lastIndexOf (it returns index of the second or last same character):
        System.out.println(sb4.lastIndexOf("l"));   // 3 
        
        // insert (it insert the given character or string from entered index position):
        System.out.println(sb4.insert(2, "zzz")); // Hezzzllo
    
        // replace (it replace the string to given string or character from given index position):
        System.out.println(sb4.replace(1, 4, "e")); // Hezllo

        // reverse (it reverse the string):
        System.out.println(sb4.reverse());  // ollzeH
        System.out.println(sb4.reverse());  

        // subSequence (it returns character between given range):
        System.out.println(sb4.subSequence(2, 6)); // zllo

        // subString (it return character from given index position to last index position):
        System.out.println(sb4.substring(1)); // ezllo

        // ensureCapacity:
        StringBuffer sb5 = new StringBuffer();
        System.out.println(sb5.capacity());     // 16
        sb5.append("Helloo");
        sb5.ensureCapacity(100);
        System.out.println("Capacity of sb5: "+sb5.capacity());     // 100

        // trimToSize (it remove wastage capacity):
        sb5.trimToSize();
        System.out.println("After trim the capacity of sb5: "+sb5.capacity()); // 6

        //setCharAt (it set given character at given index position):
        sb4.setCharAt(2, 'l');
        System.out.println(sb4);    // Helllo

        // setLength (it set length of the string):
        sb4.setLength(4);
        System.out.println(sb4);    // Hell
    
    // ------------------------------ StringBuilder --------------------------------

    StringBuilder stb = new StringBuilder("Hello");
    System.out.println(stb.capacity());   

    }
}