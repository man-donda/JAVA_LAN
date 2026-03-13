import java.util.*;

// In arraylist, we can keep adding elements without worrying about the size because it grows automatically.

public class ARRAY_LIST_THEORY{
    public static void main(String[] args) {
      
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);
        al.remove(3); // remove the element at index 3
        System.out.println(al);

        al.set(2, 111); // set the element at index 2 to 111
        System.out.println(al);

        al.add(3, 40); // add the element 40 at index 3 and shift the rest of the elements to the right
        System.out.println(al);

        System.out.println(al.size()); // get the size of the arraylist

        // System.out.println(al.get(3)); // get the element at index 3

        // System.out.println(al.isEmpty()); // check if the arraylist is empty or not
        // al.clear(); // clear the arraylist
        // System.out.println("After using clear function, the arraylist is:"+al);

        // System.out.println(al.isEmpty()); // check if the arraylist is empty or not

        // Print using for each loop:
        // System.out.println("Print using for each loop:");
        // for(int no : al){
        //     System.out.println(no);
        // }

        // Print using iterator:
        // System.out.println("Print using iterator:");
        // Iterator<Integer> itr = al.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        // Print using list iterator:
        // System.out.println("Print using list iterator:");
        // ListIterator<Integer> litr = al.listIterator();
        // while(litr.hasNext()){
        //     System.out.println(litr.next());
        // }
    
    }
}