import java.util.HashSet;
import java.util.Iterator;

public class tut34_HASHSET {
    public static void main(String[] args) {
        // Creating:
        HashSet<Integer> set = new HashSet<>();

        // Insert:
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //do not add in list cause it only add unique values.

        // Print all sets:
        System.out.println(set);

        // Search:
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set does not contains 6");
        }

        
        // Size:
        System.out.println("The size of the set is "+set.size());
        
        // Iterator:
        Iterator it = set.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        // Delete:
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contain 1, cause we deleted 1");
        }

    }
}